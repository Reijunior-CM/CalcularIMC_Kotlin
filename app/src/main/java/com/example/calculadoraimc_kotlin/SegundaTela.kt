package com.example.calculadoraimc_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private lateinit var text_peso : TextView
private lateinit var text_diagnosticos : TextView
private lateinit var text_altura : TextView


class SegundaTela : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_tela)

        text_peso=findViewById(R.id.text_peso)
        text_altura=findViewById(R.id.text_altura)
        text_diagnosticos=findViewById(R.id.text_diagnosticos)

        val bundle = intent.extras
        if (bundle != null){
            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")

            text_peso.text = "Peso informado $peso kg"
            text_altura.text = "Altura informada $altura m"

            val imc = peso /(altura * altura)
            text_diagnosticos.text = if (imc<18.5){
                 "Baixo"
            }else if (imc in 18.5..24.9){
                 "Normal"
            }else if (imc in 25.0..29.9){
                 "Sobrepeso"
            }else{
                "Obesidade"
            }
        }
    }
}