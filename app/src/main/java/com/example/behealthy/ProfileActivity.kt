package com.example.behealthy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnCatalogue = findViewById<Button>(R.id.btnC)
        btnCatalogue.setOnClickListener {
            val intent = Intent(this, Catalogue::class.java)
            startActivity(intent)
        }
    }
}