package com.example.medicalapp.repository

import com.example.medicalapp.R
import com.example.medicalapp.model.BottomNavItem

object BottomNavRepository {
    fun getBottomNavItems(): List<BottomNavItem> {
        return listOf(
            BottomNavItem("Home", R.drawable.outline_home_24, "home"),
            BottomNavItem("Health Plans", R.drawable.outline_health_and_safety_24, "health_plans"),
            BottomNavItem("Lab Tests", R.drawable.outline_lab_research_24, "lab_tests"),
            BottomNavItem("Offers", R.drawable.baseline_local_offer_24, "offers"),
            BottomNavItem("Account", R.drawable.outline_manage_accounts_24, "account")
        )
    }
}