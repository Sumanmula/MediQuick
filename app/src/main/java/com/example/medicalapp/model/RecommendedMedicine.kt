package com.example.medicalapp.model


data class RecommendedMedicine(
    val imageRes : Int,
    val name : String,
    val shortDescription : String,
    val duration : String,
    val offerPrice : String,
    val mainPrice : String
)
