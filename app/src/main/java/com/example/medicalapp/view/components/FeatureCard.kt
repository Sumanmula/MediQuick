package com.example.medicalapp.view.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.medicalapp.R

@Composable
fun FeatureCard(
    title: String,
    subtitle: String,
    backgroundColor: Color,
    imageResId: Int,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(110.dp)
            .background(color = backgroundColor, shape = RoundedCornerShape(10.dp))
            .clickable(onClick = onClick)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = title, fontSize = 15.sp, color = Color.White)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = subtitle, fontSize = 10.sp, color = Color.White)
            Spacer(modifier = Modifier.height(5.dp))
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = title,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}

@Composable
@Preview(
    showBackground = true,
    showSystemUi = true
)
fun FeatureCardPreview() {
    FeatureCard(
        title = "Pharmacy",
        subtitle = "Always genuine",
        backgroundColor = Color(0xFFC25E7F),
        imageResId = R.drawable.medicine_logo1,
        onClick = {}
    )
}