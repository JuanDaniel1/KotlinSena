package com.example.proyectodashboard2.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.proyectodashboard2.components.Items_bar
import com.example.proyectodashboard2.components.MenuItem
import com.example.proyectodashboard2.pages.Page_Contenidos
import com.example.proyectodashboard2.pages.Page_Flores
import com.example.proyectodashboard2.pages.Page_Frutas_Verduras
import com.example.proyectodashboard2.pages.Page_Huevos
import com.example.proyectodashboard2.pages.Page_Informacion
import com.example.proyectodashboard2.pages.Page_Inicio
import com.example.proyectodashboard2.pages.Page_Lacteos
import com.example.proyectodashboard2.pages.Page_Principal
import com.example.proyectodashboard2.pages.Page_Ver_Mas

// Esta seccion conecta todas las paginas con los navegadores, generando un controlador de rutas
@Composable
fun Navigation_Host(navController: NavHostController) {
    NavHost(navController = navController,
    startDestination = MenuItem.Page01.ruta) {
        composable(MenuItem.Page01.ruta){
            Page_Principal()
        }
        composable(MenuItem.Page02.ruta){
            Page_Flores()
        }
        composable(MenuItem.Page03.ruta){
            Page_Frutas_Verduras()
        }
        composable(MenuItem.Page04.ruta){
            Page_Huevos()
        }
        composable(MenuItem.Page05.ruta){
            Page_Lacteos()
        }
        composable(MenuItem.Page06.ruta){
            Page_Ver_Mas()
        }
        composable(Items_bar.Boton1.ruta){
            Page_Inicio()
        }
        composable(Items_bar.Boton2.ruta){
            Page_Contenidos()
        }
        composable(Items_bar.Boton3.ruta){
            Page_Informacion()
        }
    }
}

@Composable
fun Current_Route(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}