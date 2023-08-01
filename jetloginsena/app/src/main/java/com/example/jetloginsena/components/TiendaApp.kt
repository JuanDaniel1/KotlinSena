package com.example.jetloginsena.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.ExperimentalMaterial3Api
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetloginsena.pages.login.LoginScreen
import com.example.jetloginsena.pages.splash.SplashScreen
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.example.jetloginsena.R

enum class PagesScreen(){
    Start,
    DashBoard
}


@Composable
fun TiendaAppBar(
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
){
    TopAppBar(
        title = { Text("Proyecto_Login", style = MaterialTheme.typography.titleLarge, color = Color.White) },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = colorResource(id = R.color.greenSena)
        ),
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Back")
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TiendaApp(
    navController: NavHostController = rememberNavController()
){
    var index by rememberSaveable {
        mutableStateOf(false)
    }
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            if (index == true){
                TiendaAppBar(canNavigateBack = false, navigateUp = { /*TODO*/ })
            }
            else {}

        }
    ) {
        padding -> ScaffoldContent(
        padding = padding
        )
        NavHost(navController = navController, startDestination = PagesScreen.Start.name){
            composable(route = PagesScreen.Start.name){
                SplashScreen(navController, state = index)
            }
            composable(route = PagesScreen.DashBoard.name){
                index = true
                LoginScreen(navController, state = index)
            }
            
        }
    }
}

@Composable
fun ScaffoldContent(
    padding: PaddingValues
) {
    Column(
        modifier = Modifier
            .padding(
                top = 16.dp,
                bottom = padding.calculateBottomPadding()
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {

        }
    }
}