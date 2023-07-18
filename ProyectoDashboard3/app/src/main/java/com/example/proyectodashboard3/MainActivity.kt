package com.example.proyectodashboard3

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.proyectodashboard3.components.MainPage
import com.example.proyectodashboard3.components.TiendaApp
import com.example.proyectodashboard3.ui.theme.ProyectoDashboardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoDashboardTheme {
                // A surface container using the 'background' color from the theme
                TiendaApp()
            }
        }
    }
}

