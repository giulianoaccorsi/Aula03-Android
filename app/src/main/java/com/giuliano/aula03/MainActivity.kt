package com.giuliano.aula03

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rodarNumero = findViewById<Button>(R.id.btn_rodar)
        val numeroDigitado = findViewById<EditText>(R.id.editTextNumberSigned)

        rodarNumero.setOnClickListener {
            val numero = numeroDigitado.text.toString().toInt()
            if(numero >= 0 && numero <= 10) {
                val numeroSorteado = Random.nextInt(11)
                if (numeroSorteado == numero) {
                    Toast.makeText(this@MainActivity, "Parabéns você foi sorteado !!!!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this@MainActivity, "Não foi dessa vez :(", Toast.LENGTH_SHORT).show()
                }
            }else {
                Toast.makeText(this@MainActivity, "Digite um número de 0 até 10", Toast.LENGTH_SHORT).show()
            }


        }
    }
}