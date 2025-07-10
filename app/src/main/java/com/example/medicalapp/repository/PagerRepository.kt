package com.example.medicalapp.repository

import com.example.medicalapp.R

object PagerRepository {
    fun getPagerImages() : List<Int> {
        return listOf(
            R.drawable.pager_banner_1,
            R.drawable.pager_banner_2,
            R.drawable.pager_banner_3
        )
    }
}