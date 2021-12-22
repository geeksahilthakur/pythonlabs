package com.iamsahil.pylabs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView

class crd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crd)

        val pyvarbtn = findViewById<CardView>(R.id.pyvarbtn)
        pyvarbtn.setOnClickListener {
            val intent = Intent(this, pyvar::class.java)
            startActivity(intent)
        };

        val crd2 = findViewById<CardView>(R.id.crd2)
        crd2.setOnClickListener {
            val intent = Intent(this, pyvar::class.java)
            startActivity(intent)
        };





    }
}