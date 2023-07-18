package com.example.proyectodashboard2.pages

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.proyectodashboard2.R

@Composable
fun Page_Ver_Mas() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .fillMaxWidth()
        .verticalScroll(
            rememberScrollState()
        ),verticalArrangement = Arrangement.Center) {
        opiniones()
        Proximo()
    }
}
@Preview(showBackground = true)
@Composable
fun opiniones(){
    Column(modifier = Modifier.padding(horizontal = 10.dp)) {
        Text(text = "Opiniones", style = TextStyle(fontSize = 30.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold), modifier = Modifier.padding(vertical = 15.dp))
            Row() {
                Image(painter = painterResource(id = R.drawable.persona1), contentDescription = null, modifier = Modifier
                    .clip(
                        CircleShape
                    )
                    .width(100.dp)
                    )
                Text(text = stringResource(id = R.string.nombre1), modifier = Modifier.padding(top = 30.dp, start = 15.dp))
                Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
                Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
                Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
                Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
                Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
            }
        Card() {
            Text(stringResource(id = R.string.opinion1))
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row() {
            Image(painter = painterResource(id = R.drawable.persona2), contentDescription = null, modifier = Modifier
                .clip(
                    CircleShape
                )
                .width(100.dp))
            Text(text = stringResource(id = R.string.nombre2), modifier = Modifier.padding(top = 30.dp, start = 15.dp))
            Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
            Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
            Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
            Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
            Icon(imageVector = Icons.Default.Star, contentDescription = null, tint = Color.Yellow, modifier = Modifier.padding(top = 28.dp))
        }
        Card() {
            Text(stringResource(id = R.string.opinion2))
        }
    }


}

data class poster(
    @DrawableRes val poster:Int
        )

private val listaposter = listOf(
    poster(R.drawable.poster1),
    poster(R.drawable.poster2),
    poster(R.drawable.poster3),
    poster(R.drawable.poster4),
    poster(R.drawable.poster5),
    poster(R.drawable.poster6),
    poster(R.drawable.poster7),
    poster(R.drawable.poster8),
    poster(R.drawable.poster9)
)
@Preview(showBackground = true)
@Composable
fun Proximo(){
    var index by rememberSaveable{
        mutableStateOf(false)
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Proximamente",style = TextStyle(fontSize = 30.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold), modifier = Modifier.padding(vertical = 15.dp))
        LazyVerticalGrid(columns = GridCells.Fixed(3), modifier = Modifier.height(300.dp), horizontalArrangement = Arrangement.spacedBy(5.dp), verticalArrangement = Arrangement.spacedBy(5.dp)){
            items(listaposter){
                item ->
                Poster(imagen = item.poster)

            }

        }


    }
}
@Composable
fun Poster(
    @DrawableRes imagen:Int
){
    var index by rememberSaveable{
        mutableStateOf(false)
    }
    Card(border = BorderStroke(3.dp, color = colorResource(id = R.color.greenLight)), modifier = Modifier.clickable{index = true}) {
        Image(painter = painterResource(id = imagen), contentDescription = null, modifier = Modifier.height(300.dp), contentScale = ContentScale.Crop)
        if (index){
            Dialog(onDismissRequest = { index = false }) {
                Box(){
                    Column() {
                        IconButton(onClick = { index = false }) {
                            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null, tint = Color.White)
                        }
                        Image(painter = painterResource(id = imagen), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier.fillMaxSize())
                    }
                }

            }
        }

    }
}