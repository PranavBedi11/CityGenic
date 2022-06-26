package com.example.yeeet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yeeet.databinding.ActivityHomeBinding
import com.example.yeeet.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}