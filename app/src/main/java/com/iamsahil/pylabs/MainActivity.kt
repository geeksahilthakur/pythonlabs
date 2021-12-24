package com.iamsahil.pylabs

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val b1 = findViewById<RelativeLayout>(R.id.b1)
       b1.setOnClickListener {
            val intent = Intent(this, intropy::class.java)
            startActivity(intent)
       }

        val synbtn = findViewById<RelativeLayout>(R.id.synbtn)
        synbtn.setOnClickListener {
            val intent = Intent(this, crd::class.java)
            startActivity(intent)
        }

        val basic = findViewById<RelativeLayout>(R.id.basic)
        basic.setOnClickListener {
            val intent = Intent(this, bspr::class.java)
            startActivity(intent)
        }

    }
}