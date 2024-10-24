package com.example.navegacion.navigation

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navegacion.views.HomeView
import com.example.navegacion.views.AnosPerrunosView
import com.example.navegacion.views.EntradaTextoView
import com.example.navegacion.views.LoteriaView
import com.example.navegacion.viewModels.LoteriaViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.navegacion.components.FloatingNavigationButtons

@Composable
fun NavManager() {
    val navController = rememberNavController()

    Box(modifier = Modifier.fillMaxSize()) {

        NavHost(navController = navController, startDestination = "Home") {
            composable("Home") {
                HomeView(navController)
            }
            composable("AnosPerrunos") {
                AnosPerrunosView(navController)
            }
            composable("EntradaTexto") {
                EntradaTextoView(navController)
            }
            composable("Loteria") {
                val loteriaViewModel: LoteriaViewModel = viewModel()
                LoteriaView(viewModel = loteriaViewModel)
            }
        }

        FloatingNavigationButtons(navController = navController)
    }
}
