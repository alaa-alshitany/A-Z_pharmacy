package com.example.a_zpharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a_zpharmacy.databinding.ActivitySectionsBinding

class Sections : AppCompatActivity() {
    private lateinit var binding: ActivitySectionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySectionsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cardMedicine.setOnClickListener {
            val cardmedicineIntent = Intent(this, MedicineSection::class.java)
            startActivity(cardmedicineIntent)
        }
        binding.cardMakeUp.setOnClickListener {
            val cardmakeupIntent = Intent(this, MakeUpSection::class.java)
            startActivity(cardmakeupIntent)
        }
        binding.cardSkinCare.setOnClickListener {
            val cardskincareIntent = Intent(this, SkinCareSection::class.java)
            startActivity(cardskincareIntent)
        }
        binding.cardBaby.setOnClickListener {
            val cardbabyIntent = Intent(this, Baby::class.java)
            startActivity(cardbabyIntent)
        }
    }

    }
