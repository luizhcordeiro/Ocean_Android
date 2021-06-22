package com.ocean.ocean_android

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val btClear = findViewById<Button>(R.id.btClear)
        val etNome = findViewById<EditText>(R.id.etNome)
        val etSobrenome = findViewById<EditText>(R.id.etSobrenome)

        btEnviar.setOnClickListener {
            tvResultado.text = StringBuilder().append(etNome.text).append(" ").append(etSobrenome.text).toString()
        }

        btClear.setOnClickListener {
            etNome.setText("")
            etSobrenome.text.clear()
            tvResultado.setText(R.string.tvResultado)
        }

    }
}