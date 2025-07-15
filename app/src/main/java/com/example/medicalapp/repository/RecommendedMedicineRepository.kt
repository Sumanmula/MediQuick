package com.example.medicalapp.repository

import com.example.medicalapp.R
import com.example.medicalapp.model.RecommendedMedicine

object RecommendedMedicineRepository {
    fun getRecommendedMedicines(): List<RecommendedMedicine> {
        return listOf(
            RecommendedMedicine(R.drawable.pan, "Pan 40 Tablet", "15 tablets", "Get in 10 minutes", "₹155", "₹168"),
            RecommendedMedicine(R.drawable.montina_l, "Montina-L Tablet", "10 tablets", "Get in 10 minutes", "₹68.7", "₹83"),
            RecommendedMedicine(R.drawable.antacid_gelusil, "Gelusil MPS Antacid", "400 ml oral liquid", "Get in 10 minutes", "₹201", "₹254.06"),
            RecommendedMedicine(R.drawable.ascoril_cough_syrup, "Ascoril LS Syrup", "100 ml syrup", "Get in 20 minutes", "₹117", "₹141"),
            RecommendedMedicine(R.drawable.amlosure_at_low_pressure, "TripleACal Tablet", "15 tablets", "Get in 10 minutes", "₹136", "₹151"),
            RecommendedMedicine(R.drawable.metformin_diabetes, "Okamet 500 Tablet ", "20 tablets", "Get in 10 minutes", "₹19.3", "₹27.6"),
            RecommendedMedicine(R.drawable.immunity_booster, "Immusante Tablet", "20 tablets", "Get in 30 minutes", "₹120", "₹130"),
            RecommendedMedicine(R.drawable.zincovit_syrup, "Zincovit Syrup", "200 ml syrup", "Get in 30 minutes", "₹155", "₹170"),
            RecommendedMedicine(R.drawable.atorvastatin_cholestorel, "Lipidator-20 Tablet", "10 tablets", "Get in 10 minutes", "₹54.9", "₹66.38"),
            RecommendedMedicine(R.drawable.vitamin_syrup, "MultiVitamin Syrup", "200 ml syrup", "Get in 10 minutes", "₹193", "₹231"),
        )
    }
}