package com.adityaproj.chowchain

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main9)
        val imageButton = findViewById<ImageButton>(R.id.image1)
        val text=findViewById<TextView>(R.id.trose)
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.rose)
            val data:String=text.text.toString()
            intent.putExtra("name", data)
            startActivity(intent)

        }

        val img=findViewById<ImageButton>(R.id.image2)
        val text1=findViewById<TextView>(R.id.tkulhad)
        img.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.mitti)
            intent.putExtra("name",text1.text.toString())
            startActivity(intent)

        }
        val img2=findViewById<ImageButton>(R.id.image3)
        val text2=findViewById<TextView>(R.id.tchai)
        img2.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)

            intent.putExtra("imageResId", R.drawable.normal)
            intent.putExtra("name",text2.text.toString())
            startActivity(intent)
        }
        val img3=findViewById<ImageButton>(R.id.image4)
        val text3 = findViewById<TextView>(R.id.tcof)
        img3.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.ciffee )
            intent.putExtra("name",text3.text.toString())
            startActivity(intent)
        }


    }
}