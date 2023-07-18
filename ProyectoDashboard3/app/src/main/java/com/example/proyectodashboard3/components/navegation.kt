package com.example.proyectodashboard3.components

sealed class navegation(val route:String){
    object Splash: navegation("first_screen")
    object Login: navegation("second_screen")
}
