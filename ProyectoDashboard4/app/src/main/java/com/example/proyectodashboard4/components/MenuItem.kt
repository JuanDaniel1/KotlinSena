package com.example.proyectodashboard4.components

import com.example.proyectodashboard4.R

// Esta clase representa cada item del menu desplegable donde se define icono, titulo y ruta de cada uno
sealed class MenuItem (
    val icon: Int,
    val title: String,
    val ruta: String
        ) {
    object  Page01: MenuItem(R.drawable.ic_principal_web, "Principal", "page01")
    object  Page02: MenuItem(R.drawable.ic_flores, "Flores", "page02")
    object  Page03: MenuItem(R.drawable.ic_frutas_verduras, "Frutas y Verduras", "page03")
    object  Page04: MenuItem(R.drawable.ic_huevos, "Huevos", "page04")
    object  Page05: MenuItem(R.drawable.ic_leche, "Lacteos", "page05")
    object  Page06: MenuItem(R.drawable.ic_ver_mas, "Ver mas", "page06")
}
