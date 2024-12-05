package com.adityaproj.chowchain

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        val dive=findViewById<Button>(R.id.loginButton)
        dive.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
            Toast.makeText(this, "Diving in to something intersting", Toast.LENGTH_SHORT).show()



        }

        }
    }
