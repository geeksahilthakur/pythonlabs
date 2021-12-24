package com.iamsahil.pylabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class bspr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bspr)

        val crd1 = findViewById<CardView>(R.id.crd1)
        crd1.setOnClickListener {
            val intent = Intent(this, mlg::class.java)
            startActivity(intent)
        };


        val crd2 = findViewById<CardView>(R.id.crd2)
        crd2.setOnClickListener {
            val intent = Intent(this, numgss::class.java)
            startActivity(intent)
        };

        val crd3 = findViewById<CardView>(R.id.crd3)
        crd3.setOnClickListener {
            val intent = Intent(this, rps::class.java)
            startActivity(intent)
        };

        val crd4 = findViewById<CardView>(R.id.crd4)
        crd4.setOnClickListener {
            val intent = Intent(this, utube::class.java)
            startActivity(intent)
        };




    }
}