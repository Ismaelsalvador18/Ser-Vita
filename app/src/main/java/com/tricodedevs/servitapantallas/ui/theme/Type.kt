package com.tricodedevs.servita.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tricodedevs.servitapantallas.R


val inspiration = FontFamily(Font(R.font.inspiration_regular, FontWeight.Normal))

val Merriweather = FontFamily.Serif
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = Merriweather,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 42.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Merriweather,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Merriweather,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Merriweather,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Merriweather,
        fontWeight = FontWeight.Light,
        fontSize = 12.sp
    ),

    titleLarge = TextStyle(
        fontFamily = inspiration,
        fontWeight = FontWeight.Normal,
        fontSize = 48.sp,
        lineHeight = 64.sp
    ),
)
