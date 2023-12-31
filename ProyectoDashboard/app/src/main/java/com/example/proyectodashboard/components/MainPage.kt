package com.example.proyectodashboard.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.proyectodashboard.ui.theme.ProyectoDashboardTheme


@Composable
fun MainPage() {
    val navController = rememberNavController()
    // scaffoldState: guarda el estado permitiendo conocer la configuracion
    val scaffoldState = rememberScaffoldState()
    // scope: utilizada para abrir/cerrar el menu lateral
    val scope = rememberCoroutineScope()
    //Opciones de navegacion del Drawer
    val navigationItems = listOf(
        MenuItem.Page01,
        MenuItem.Page02,
        MenuItem.Page03,
        MenuItem.Page04,
        MenuItem.Page05,
        MenuItem.Page06
    )

    //Opciones de navegacion del BottomBar
    val navigationItemsBottomBar = listOf(
        Items_bar.Boton1,
        Items_bar.Boton2,
        Items_bar.Boton3
    )

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopBar(
                scope,
                scaffoldState,
                navController,
                navigationItems
            )
        },
        drawerContent = {
            DrawerMenu(
                scope,
                scaffoldState,
                navController,
                menu_items = navigationItems
            )
        },
        bottomBar = {
            BottomMenu(
                navController,
                menu_items_bar = navigationItemsBottomBar
            )
        },
        floatingActionButton = {
            Fab(
                scope,
                scaffoldState
            )
        },
        isFloatingActionButtonDocked = true
    )
    {
        padding ->
        ContentScaffold(
            padding = padding
        )
        Navigation_Host(navController)
    }

}

@Composable
fun ContentScaffold(padding: PaddingValues) {

}

@Preview
@Composable
fun MainPagePreview() {
    ProyectoDashboardTheme {
        // A surface container using the 'background' color from the theme
        MainPage()
    }
}