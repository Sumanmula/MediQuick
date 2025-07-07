package com.example.medicalapp.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.medicalapp.R

@Composable
fun WelcomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.65f)
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFE5B232),
                            Color(0xFFFFEBB9)
                        )
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(280.dp)
                    .background(
                        color = Color.White.copy(alpha = 0.1f),
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center

            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(R.drawable.mediquick_splash_logo),
                    contentDescription = "Splash Logo"
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.35f)
                .padding(horizontal = 24.dp, vertical = 32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Get Well Sooner with MediQuick",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF272140),
                    textAlign = TextAlign.Center,
                    lineHeight = 28.sp
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    "MediQuick is your reliable partner for fast and affordable medicine delivery. From prescription drugs to health essentials, get everything delivered right to your doorstep",
                    fontSize = 16.sp,
                    color = Color(0xFF50577E),
                    textAlign = TextAlign.Center,
                    lineHeight = 24.sp
                )

                Spacer(modifier = Modifier.height(26.dp))

                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(56.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF8C42)),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Text(
                        text = "Let's Continue",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                }
            }
        }
    }
}


@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)
fun WelcomeScreenPreview() {
    WelcomeScreen()
}