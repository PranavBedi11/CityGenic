package com.example.yeeet



import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.yeeet.databinding.BeachActivityBinding



class beachActivity : AppCompatActivity() {
    private lateinit var binding: BeachActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BeachActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.volBtn.setOnClickListener {


            startActivity(Intent(this, EmailSend::class.java))




        }
    }
}