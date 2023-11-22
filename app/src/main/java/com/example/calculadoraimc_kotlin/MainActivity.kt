package com.example.calculadoraimc_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

private lateinit var btn_Calcular : Button
private lateinit var edit_peso : EditText
private lateinit var edit_altura : EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_altura=findViewById(R.id.edit_altura)
        edit_peso=findViewById(R.id.edit_peso)
        btn_Calcular=findViewById(R.id.btn_Calcular)
        btn_Calcular.setOnClickListener {
            val intent = Intent(this, SegundaTela::class.java )

            val peso = edit_peso.text.toString()
            val altura = edit_altura.text.toString()
            if (peso.isNotEmpty() && altura.isNotEmpty()){
                intent.putExtra("peso", peso.toDouble())
                intent.putExtra("altura", altura.toDouble())
            }

            startActivity(intent)
        }

    }
}