package com.example.viikkotehtv4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.viikkotehtv4.ui.theme.Viikkotehtävä4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Viikkotehtävä4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top, // Arrange items from the top
            horizontalAlignment = Alignment.CenterHorizontally // Center items horizontally
        ) {
            // Title at the top
            Text(
                text = "Welcome to My App", // Your title text
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.secondary,// Use a title style
                modifier = Modifier.padding(16.dp) // Padding for spacing
            )

            // Greeting Text
            Text(

                text = "Hello $name!",
                modifier = Modifier.padding(16.dp),
                color = MaterialTheme.colorScheme.tertiary,

            // Padding for spacing from top
            )

            Spacer(modifier = Modifier.weight(1f)) // Space to push the button down

            // Centered Button
            Button(
                onClick = { /* Handle button click */ },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                modifier = Modifier.align(Alignment.CenterHorizontally) // Center the button
            ) {
                Text("Makkara")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Viikkotehtävä4Theme {
        Greeting("Android")
    }
}
