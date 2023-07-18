package com.example.proyectodashboard4.pages

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import android.graphics.BitmapFactory
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.proyectodashboard4.R
import com.example.proyectodashboard4.components.CreateChannelNotification
import com.example.proyectodashboard4.components.notificacionExtensa

@Composable
fun Page_Informacion() {
    val idNotification: Int = 0
    val context: Context = LocalContext.current
    val idChannel: String = "CanalTienda"
    val name = "CanalTienda"
    val descriptionText = "Canal de Notificaciones"

    val textShort: String = "Ejemplo de notificacion sencilla con prioridad por omision (default)"
    val textLong: String = "Saludos! El SENA amplió hasta el próximo domingo 11 de junio el plazo de participar en la Convocatoria Nacional de Extensionismo Tecnológico 2023 para la estrategia ‘MiPyme Se Transforma’."
    val iconoBig = BitmapFactory.decodeResource(
        context.resources,
        R.drawable.correo
    )
    val imagenBig = BitmapFactory.decodeResource(
        context.resources,
        R.drawable.bg_tienda_cba
    )

    LaunchedEffect(Unit){
        CreateChannelNotification(
            idChannel,
            context,
            name,
            descriptionText
        )
    }
    Column(
        Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState()), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "Noticias", style = TextStyle(fontSize = 30.sp, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold), modifier = Modifier.padding(vertical = 15.dp))
        grillas()
        Button(onClick = { notificacionExtensa(
            context,
            idChannel,
            idNotification + 1,
            textTitle = "Noticia Sena",
            textContent = textLong,
            iconoBig,
            


        ) }) {
            Text(text = "Solicitar mas noticias")
        }
    }


    



}
data class fotos(
    @DrawableRes val imagen:Int,
    @StringRes val titulo: Int,
    @StringRes val texto: Int
)
private val lista = listOf(
    fotos(R.drawable.noticia1, R.string.notit1, R.string.notext1),
    fotos(R.drawable.noticia2, R.string.notit2, R.string.notext2),
    fotos(R.drawable.noticia3, R.string.notit3, R.string.notext3),
    fotos(R.drawable.noticia4, R.string.notit4, R.string.notext4),
    fotos(R.drawable.noticia5, R.string.notit5, R.string.notext5),
)
@Composable
fun cardnot(
    @DrawableRes imagen: Int,
    @StringRes titulo: Int,
    @StringRes texto: Int
){
    val brush = Brush.linearGradient(
        0.0f to Color.White,
        500000f to colorResource(id = R.color.greenLight),
        start = Offset.Zero,
        end = Offset.Infinite
    )
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp), elevation = 15.dp) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxWidth()
            .background(brush)) {
            Image(painter = painterResource(id = imagen), contentDescription = null, contentScale = ContentScale.Crop, modifier = Modifier.padding(10.dp).fillMaxWidth())
            Text(text = stringResource(id = titulo), style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold, color = Color.White), modifier = Modifier.padding(horizontal = 10.dp, vertical = 3.dp))
            Text(text = stringResource(id = texto), style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Light), modifier = Modifier.padding(horizontal = 10.dp, vertical = 3.dp))
        }
    }
}
@Composable
fun grillas(){
    LazyColumn(Modifier.height(600.dp)){
        items(lista){
            item ->
            cardnot(imagen = item.imagen, titulo = item.titulo, texto = item.texto)
        }
    }
}
