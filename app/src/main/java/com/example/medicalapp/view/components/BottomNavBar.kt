package com.example.medicalapp.view.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.*
import com.example.medicalapp.model.BottomNavItem

@Composable
fun BottomNavBar(
    items: List<BottomNavItem>,
    selectedIndex: Int,
    onItemSelected: (Int) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(65.dp)
            .padding(horizontal = 8.dp),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        items.forEachIndexed { index, item ->
            Column(
                modifier = Modifier
                    .clickable { onItemSelected(index) }
                    .padding(vertical = 6.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val isSelected = index == selectedIndex

                Image(
                    painter = painterResource(id = item.iconRes),
                    contentDescription = item.title,
                    modifier = Modifier
                        .size(28.dp)
                        .padding(bottom = 4.dp),
                    colorFilter = androidx.compose.ui.graphics.ColorFilter.tint(
                        if (isSelected) Color(0xFF0A8754) else Color.Black
                    )
                )

                androidx.compose.material3.Text(
                    text = item.title,
                    fontSize = 10.sp,
                    color = if (isSelected) Color(0xFF0A8754) else Color.Gray
                )
            }
        }
    }
}