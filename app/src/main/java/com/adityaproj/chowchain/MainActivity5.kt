package com.adityaproj.chowchain

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)
        val veggiev=findViewById<ImageButton>(R.id.veggie)
        val noni=findViewById<ImageButton>(R.id.nonveg)
        val chuski=findViewById<ImageButton>(R.id.tea)
          veggiev.setOnClickListener {
              val intent = Intent(this, MainActivity6::class.java)
              startActivity(intent)
          }
        noni.setOnClickListener {
            val intent=Intent(this,MainActivity8::class.java)
            startActivity(intent)
        }
        chuski.setOnClickListener {
            val intent=Intent(this,MainActivity9::class.java)
            startActivity(intent)
        }

        }
    }
