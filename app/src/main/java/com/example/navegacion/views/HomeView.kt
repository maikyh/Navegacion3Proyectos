package com.example.navegacion.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.navegacion.components.FloatingNavigationButtons
import com.example.navegacion.components.MainButton
import com.example.navegacion.components.TitleView

@Composable
fun HomeView(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleView(name = "Home View")

            MainButton(name = "Anos Perrunos", backColor = Color.Red, color = Color.White) {
                navController.navigate("AnosPerrunos")
            }

            MainButton(name = "Descuentos App", backColor = Color.Blue, color = Color.White) {
                navController.navigate("EntradaTexto")
            }

            MainButton(name = "Loteria", backColor = Color.Magenta, color = Color.White) {
                navController.navigate("Loteria")
            }
        }

        FloatingNavigationButtons(navController = navController)
    }
}

