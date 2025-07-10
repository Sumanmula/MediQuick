package com.example.medicalapp.view.screen

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import com.example.medicalapp.R
import com.example.medicalapp.repository.*
import com.example.medicalapp.view.components.*

@Composable
fun HomeScreen() {
    var searchQuery by remember { mutableStateOf("") }
    val navItems = BottomNavRepository.getBottomNavItems()
    var selectedTabIndex by remember { mutableStateOf(0) }

    Scaffold(
        // Nav Bar Items
        bottomBar = {
            BottomNavBar(
                items = navItems,
                selectedIndex = selectedTabIndex,
                onItemSelected = { selectedTabIndex = it }
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .background(Color.White)
        ) {
            // Top Bar
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp, bottom = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "Menu",
                    tint = Color(0xFF272140),
                    modifier = Modifier.size(24.dp)
                )
                Image(
                    painter = painterResource(R.drawable.shopping_basket),
                    contentDescription = "Cart",
                    modifier = Modifier.size(24.dp)
                )
            }

            // Search Bar
            OutlinedTextField(
                value = searchQuery,
                onValueChange = { searchQuery = it },
                placeholder = {
                    Text("Search for Medicines", color = Color.Gray)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 14.dp),
                singleLine = true,
                shape = RoundedCornerShape(16.dp),
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
                    }
                }
            )

            Spacer(modifier = Modifier.height(15.dp))

            // Scrollable Content
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 14.dp)
            ) {
                // Feature Cards
                item {
                    val featureList = listOf(
                        Triple("Pharmacy", "Always genuine", R.drawable.medicine_logo1),
                        Triple("Lab tests", "Smart reports", R.drawable.shopping_basket),
                        Triple("Records", "& Insights", R.drawable.antacid_gelusil)
                    )
                    val colorList = listOf(
                        Color(0xFFC25E7F),
                        Color(0xFF6EC1CB),
                        Color(0xFF71D276)
                    )

                    LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                        items(featureList.size) { index ->
                            FeatureCard(
                                title = featureList[index].first,
                                subtitle = featureList[index].second,
                                imageResId = featureList[index].third,
                                backgroundColor = colorList[index],
                                onClick = {
                                    println("${featureList[index].first} clicked")
                                }
                            )
                        }
                    }

                    Spacer(modifier = Modifier.height(15.dp))
                }

                // Upload Prescription Box
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.LightGray, shape = RoundedCornerShape(10.dp))
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 5.dp),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.shopping_basket),
                                contentDescription = null,
                                modifier = Modifier.size(30.dp)
                            )
                            Text(
                                text = "Order with prescription",
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color.Black
                            )
                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                                shape = RoundedCornerShape(15.dp)
                            ) {
                                Text("Upload now")
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(15.dp))
                }

                // Image Pager
                item {
                    val imageList = PagerRepository.getPagerImages()

                    ImagePager(imageResIds = imageList)

                    Spacer(modifier = Modifier.height(15.dp))
                }
            } // Scrollable content Closed
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun HomeScreenPreview() {
    HomeScreen()
}
