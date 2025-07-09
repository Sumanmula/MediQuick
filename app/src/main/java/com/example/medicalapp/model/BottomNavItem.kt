package com.example.medicalapp.model

import androidx.annotation.DrawableRes

data class BottomNavItem(
    val title: String,
    @DrawableRes val iconRes: Int,
    val route: String
)
