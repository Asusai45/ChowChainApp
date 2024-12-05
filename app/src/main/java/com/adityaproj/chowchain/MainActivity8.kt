package com.adityaproj.chowchain

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main8)
        val imageButton = findViewById<ImageButton>(R.id.image1)
        val text=findViewById<TextView>(R.id.trose)
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.cbiryani)
            val data:String=text.text.toString()
            intent.putExtra("name", data)
            startActivity(intent)

        }

        val img=findViewById<ImageButton>(R.id.image2)
        val text1=findViewById<TextView>(R.id.tkulhad)
        img.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.masala)
            intent.putExtra("name",text1.text.toString())
            startActivity(intent)

        }
        val img2=findViewById<ImageButton>(R.id.image3)
        val text2=findViewById<TextView>(R.id.tchai)
        img2.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)

            intent.putExtra("imageResId", R.drawable.eggroll)
            intent.putExtra("name",text2.text.toString())
            startActivity(intent)
        }
        val img3=findViewById<ImageButton>(R.id.image4)
        val text3 = findViewById<TextView>(R.id.tswarma)
        img3.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.chickenswarma )
            intent.putExtra("name",text3.text.toString())
            startActivity(intent)
        }
        val img4=findViewById<ImageButton>(R.id.image5)
        val text4=findViewById<TextView>(R.id.tmutton)
        img4.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.mutton)
            intent.putExtra("name",text4.text.toString())
            startActivity(intent)
        }
        val img5=findViewById<ImageButton>(R.id.image6)
        val text5=findViewById<TextView>(R.id.tmbiryani)
        img5.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.kato)
            intent.putExtra("name",text5.text.toString())
            startActivity(intent)
        }
        val img6=findViewById<ImageButton>(R.id.image7)
        val text6=findViewById<TextView>(R.id.tchcho)
        img6.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.choka)
            intent.putExtra("name",text6.text.toString())
            startActivity(intent)
        }
        val img7=findViewById<ImageButton>(R.id.image8)
        val text7=findViewById<TextView>(R.id.tbutter)
        img7.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            intent.putExtra("imageResId", R.drawable.butter)
            intent.putExtra("name",text7.text.toString())
            startActivity(intent)
        }

    }
}