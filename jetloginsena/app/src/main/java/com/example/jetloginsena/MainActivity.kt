package com.example.jetloginsena

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.jetloginsena.components.TiendaApp
import com.example.jetlogin.ui.theme.JetloginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetloginTheme {
                // A surface container using the 'background' color from the theme

                    TiendaApp()

            }
        }
    }
}

