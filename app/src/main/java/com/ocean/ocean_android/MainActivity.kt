package com.ocean.ocean_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_INFO = "EXTRA_INFO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btClear = findViewById<Button>(R.id.btClear)
        val etNome = findViewById<EditText>(R.id.etNome)
        val etSobrenome = findViewById<EditText>(R.id.etSobrenome)
        val btNovatela = findViewById<Button>(R.id.btNovatela)

        btEnviar.setOnClickListener {
            tvResultado.text = StringBuilder().append(etNome.text).append(" ").append(etSobrenome.text).toString()
        }

        btClear.setOnClickListener {
            etNome.setText("")
            etSobrenome.text.clear()
            tvResultado.setText(R.string.tvResultado)
        }

        btNovatela.setOnClickListener {
            val novaTelaIntent = Intent(this, MainActivity2::class.java)
            novaTelaIntent.putExtra(EXTRA_INFO, etNome.text.toString())
            startActivity(novaTelaIntent)
        }

    }
}