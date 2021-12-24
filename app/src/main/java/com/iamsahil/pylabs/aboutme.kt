package com.iamsahil.pylabs

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class aboutme : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutme)

        val git = findViewById<ImageView>(R.id.git)
        git.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://github.com/geeksahilthakur")
            startActivity(openURL)
        }

        val insta = findViewById<ImageView>(R.id.insta)
        insta.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://www.instagram.com/aslisahil_/")
            startActivity(openURL)
        }

        val whatsapp = findViewById<ImageView>(R.id.whatsapp)
        whatsapp.setOnClickListener {
            val openURL = Intent(android.content.Intent.ACTION_VIEW)
            openURL.data = Uri.parse("https://chat.whatsapp.com/D9dFIP1LVduI0SqL2SEXXv")
            startActivity(openURL)
        }


    }
}