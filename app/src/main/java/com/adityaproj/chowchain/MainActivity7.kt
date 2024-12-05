package com.adityaproj.chowchain

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val imageResId = intent.getIntExtra("imageResId", 0)
        val image= findViewById<ImageButton>(R.id.imageButton)
        if (imageResId != 0) {
            image.setImageResource(imageResId)
        }
        val received = intent.getStringExtra("name")
        val textView = findViewById<TextView>(R.id.textView10)
        textView.text = received.orEmpty()

        val rate= findViewById<RatingBar>(R.id.rating)
        val  button  = findViewById<Button>(R.id.submit)
        val  text= findViewById<TextView>(R.id.rator)
        val submit=findViewById<Button>(R.id.order)
        rate.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            text.text=rating.toString()
            when(rating.toInt()){
                1 -> text.text="we our sorry for the inconvinence"
                2 -> text.text="suggest us the ways to improve by contacting us"
                3 -> text.text="we will surely do better next time"
                4 -> text.text="thankyou"
                5 -> text.text="enjoy the vibe buddy"
                else -> text.text="  "


            }

        }
        button.setOnClickListener {
            val message = rate.rating.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
        submit.setOnClickListener {
            val intent=Intent(this,MainActivity10::class.java)
            startActivity(intent)
        }
        val help=findViewById<Button>(R.id.help)
        help.setOnClickListener{
            val intent = Intent(this,MainActivity11::class.java)
            startActivity(intent)
        }

        }

    }

