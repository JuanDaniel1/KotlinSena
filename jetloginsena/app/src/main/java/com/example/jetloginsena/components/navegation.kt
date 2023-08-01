package com.example.jetloginsena.components

sealed class navegation(val route:String){
    object Splash: navegation("first_screen")
    object Login: navegation("second_screen")
}
