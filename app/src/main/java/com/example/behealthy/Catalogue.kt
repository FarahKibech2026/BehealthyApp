package com.example.behealthy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Catalogue : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogue)

        val boutons = mapOf(
            R.id.btnProduit1 to getString(R.string.produit1),
            R.id.btnProduit2 to getString(R.string.produit2),
            R.id.btnProduit3 to getString(R.string.produit3),
            R.id.btnProduit4 to getString(R.string.produit4),
            R.id.btnProduit5 to getString(R.string.produit5)
        )

        boutons.forEach { (id, nom) ->
            findViewById<Button>(id).setOnClickListener {
                Toast.makeText(
                    this,
                    "Produit sélectionné : $nom",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}