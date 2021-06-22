package com.ocean.ocean_android

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val txTopo = findViewById<TextView>(R.id.txTopo)
        val btVoltar = findViewById<Button>(R.id.btVoltar)

        txTopo.setText(intent.getStringExtra("EXTRA_INFO"))

        btVoltar.setOnClickListener {
            val voltarIntent = Intent(this, MainActivity::class.java)
            startActivity(voltarIntent)
        }
    }
}