package com.example.behealthy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Catalogue : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogue)

        val btn1 = findViewById<Button>(R.id.btnProduit1)
        val btn2 = findViewById<Button>(R.id.btnProduit2)
        val btn3 = findViewById<Button>(R.id.btnProduit3)
        val btn4 = findViewById<Button>(R.id.btnProduit4)
        val btn5 = findViewById<Button>(R.id.btnProduit5)

        btn1.setOnClickListener {
            Toast.makeText(this, "Produit 1 ajouté au panier ✅", Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {
            Toast.makeText(this, "Produit 2 ajouté au panier ✅", Toast.LENGTH_SHORT).show()
        }
        btn3.setOnClickListener {
            Toast.makeText(this, "Produit 3 ajouté au panier ✅", Toast.LENGTH_SHORT).show()
        }
        btn4.setOnClickListener {
            Toast.makeText(this, "Produit 4 ajouté au panier ✅", Toast.LENGTH_SHORT).show()
        }
        btn5.setOnClickListener {
            Toast.makeText(this, "Produit 5 ajouté au panier ✅", Toast.LENGTH_SHORT).show()
        }
    }
}
