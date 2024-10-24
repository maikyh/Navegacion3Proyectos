package com.example.navegacion.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FloatingNavigationButtons(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End
    ) {
        FloatingActionButton(
            onClick = { navController.navigate("Home") },
            modifier = Modifier.padding(bottom = 16.dp),
            content = { Text(text = "Home") }  // Specify content like this to avoid ambiguity
        )

        FloatingActionButton(
            onClick = { navController.navigate("AnosPerrunos") },
            modifier = Modifier.padding(bottom = 16.dp),
            content = { Text(text = "Años Perrunos") }
        )

        FloatingActionButton(
            onClick = { navController.navigate("DescuentosApp") },
            modifier = Modifier.padding(bottom = 16.dp),
            content = { Text(text = "Entrada Texto") }
        )

        FloatingActionButton(
            onClick = { navController.navigate("Loteria") },
            content = { Text(text = "Lotería") }
        )
    }
}
