package com.example.yeeet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.yeeet.databinding.BeachActivityBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val cardBeach = findViewById<CardView>(R.id.cardBeach)
        val cardPark = findViewById<CardView>(R.id.cardPark)
        val cardStreets = findViewById<CardView>(R.id.cardStreet)
        val cardLake = findViewById<CardView>(R.id.cardLake)
        cardBeach.setOnClickListener{
            startActivity(Intent(this@HomeActivity,places::class.java))
        }
        cardPark.setOnClickListener{
            startActivity(Intent(this@HomeActivity,places::class.java ))
        }
        cardStreets.setOnClickListener{
            startActivity(Intent(this@HomeActivity,places::class.java ))
        }
        cardLake.setOnClickListener{
            startActivity(Intent(this@HomeActivity,places::class.java ))
        }
    }




}