package com.example.tipcalculator.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val TipLightColorScheme = lightColorScheme(
    primary = TipPrimary,
    onPrimary = TipOnPrimary,
    background = TipBackground,
    onBackground = TipOnSurface,
    surface = TipBackground,
    onSurface = TipOnSurface,
    surfaceVariant = TipFieldContainer,
    surfaceContainerHighest = TipFieldContainer, // fond des TextField (Material3 récent)
    onSurfaceVariant = TipOnSurfaceVariant,
    outline = TipOutline
)

// Thème clair fixe : pas de couleurs dynamiques ni de mode sombre,
// pour obtenir le même rendu que l'image du cours sur tous les téléphones.
@Composable
fun TipCalculatorTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = TipLightColorScheme,
        typography = Typography, // défini dans ton Type.kt existant
        content = content
    )
}