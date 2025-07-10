package com.example.medicalapp.view.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.medicalapp.R

@Composable
fun SplashScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFEBB9)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.mediquick_splash_logo),
            contentDescription = "Splash Logo",
            modifier = Modifier.fillMaxSize()
        )
    }
}


@Composable
@Preview(showBackground = true)
fun SplashScreenPreview() {
    SplashScreen()
}