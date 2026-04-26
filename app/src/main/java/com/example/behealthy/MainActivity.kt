package com.example.behealthy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var mResultTV: TextView
    private lateinit var mPoidsET: EditText
    private lateinit var mTailleET: EditText
    private lateinit var mCalculerBTN: Button
    private lateinit var mListView: ListView   // ← AJOUT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()
        initEvent()
        initListView()
    }

    private fun initView() {
        mCalculerBTN = findViewById(R.id.button)
        mPoidsET     = findViewById(R.id.poids)
        mTailleET    = findViewById(R.id.taille)
        mResultTV    = findViewById(R.id.text2)
        mListView    = findViewById(R.id.listViewProducts)
    }

    private fun initEvent() {
        mCalculerBTN.setOnClickListener {
            val pStr = mPoidsET.text.toString()
            val tStr = mTailleET.text.toString()

            if (pStr.isEmpty() || tStr.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs",
                    Toast.LENGTH_SHORT).show()
            } else {
                val poids  = pStr.toFloat()
                val taille = tStr.toFloat()

                if (taille > 0) {
                    val imc = poids / (taille * taille)
                    val categorie = when {
                        imc < 18.5 -> "Maigreur"
                        imc < 25   -> "Normal"
                        imc < 30   -> "Surpoids"
                        else       -> "Obésité"
                    }
                    mResultTV.text = getString(R.string.resultat_imc,
                        String.format(java.util.Locale.getDefault(), "%.2f", imc),
                        categorie)
                } else {
                    Toast.makeText(this, "La taille doit être supérieure à 0",
                        Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    private fun initListView() {
        val products = resources.getStringArray(R.array.products)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, products)

        mListView.adapter = adapter

        mListView.setOnItemClickListener { parent, _, position, _ ->
            val item = parent.getItemAtPosition(position).toString()

            Toast.makeText(this, "Produit sélectionné : $item", Toast.LENGTH_SHORT).show()
        }
    }
}