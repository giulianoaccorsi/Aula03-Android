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
        // Procura pelo ID o botão de rodar e salva a referencia na variável rodar número
        val rodarNumero = findViewById<Button>(R.id.btn_rodar)
        // Procura pelo ID o editText e salva a referencia na variável rodar número
        val numeroDigitado = findViewById<EditText>(R.id.editTextNumberSigned)

        rodarNumero.setOnClickListener {
            // converte o número digitado em Int
            val numero = numeroDigitado.text.toString().toInt()

            // Se o número for maior ou igual a zero e o número for menor ou igual a 10
            if(numero >= 0 && numero <= 10) {
                // gera um número random de 0 até 10
                val numeroSorteado = Random.nextInt(11)
                // se o número sorteado gerado for igual ao número digitado
                if (numeroSorteado == numero) {
                    // mostra um toast parabenizando
                    Toast.makeText(this@MainActivity, "Parabéns você foi sorteado !!!!", Toast.LENGTH_SHORT).show()
                } else {
                    // Mostra um toast avisando que não foi dessa vez
                    Toast.makeText(this@MainActivity, "Não foi dessa vez :(", Toast.LENGTH_SHORT).show()
                }
            }else {
                // Se o número for menor que 0 ou maior que 10, pede para digitar um número entre 0 e 10
                Toast.makeText(this@MainActivity, "Digite um número de 0 até 10", Toast.LENGTH_SHORT).show()
            }


        }
    }
}