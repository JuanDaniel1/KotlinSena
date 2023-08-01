package com.example.jetlogin.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.jetloginsena.R


private  val teko = FontFamily(
    Font(R.font.teko_regular, FontWeight.Normal),
    Font(R.font.teko_light, FontWeight.Light),
    Font(R.font.teko_medium, FontWeight.Medium),
    Font(R.font.teko_semibold, FontWeight.SemiBold),
    Font(R.font.teko_bold, FontWeight.Bold)
)
// Set of Material typography styles to start with
val Typography = Typography(
    titleMedium = TextStyle(
        fontFamily = teko,
        fontWeight = FontWeight.SemiBold,
        fontSize = 25.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = teko,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = teko,
        fontWeight = FontWeight.Light,
        fontSize = 18.sp
    ),
    titleLarge = TextStyle(
        fontFamily = teko,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)