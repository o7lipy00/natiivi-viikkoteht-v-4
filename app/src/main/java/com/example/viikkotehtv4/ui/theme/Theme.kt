package com.example.viikkotehtv4.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

import androidx.compose.ui.graphics.Color

val CustomPrimaryColor = Color(0xFFFFA500)// Example primary color (purple)
val CustomSecondaryColor = Color(0xFF03DAC5) // Example secondary color (teal)
val CustomTertiaryColor = Color(0xFFBB86FC)

private val DarkColorScheme = darkColorScheme(
    primary = CustomPrimaryColor,
    secondary = CustomSecondaryColor,
    tertiary = CustomTertiaryColor
    // You can add other colors here, like background, surface, etc.
)

private val LightColorScheme = lightColorScheme(
    primary = CustomPrimaryColor,
    secondary = CustomSecondaryColor,
    tertiary = CustomTertiaryColor
    // You can add other colors here, like background, surface, etc.
)

@Composable
fun Viikkotehtävä4Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}