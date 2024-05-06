package com.example.st10453453.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        // Declerations
        val petImageView = findViewById<ImageView>(R.id.petImageView)
        val feedButton = findViewById<Button>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)

        val tomTextView = findViewById<TextView>(R.id.tomTextView)

        tomTextView.text = "Please feed me"


        //change the pets image to match feed action icon
        feedButton.setOnClickListener {
            petImageView.setImageResource(R.drawable.image2)
            //update the feed comment
            tomTextView.text = "thank_you for feeding me,please clean me"
        }
        //change the pets image to match clean action icon
        cleanButton.setOnClickListener {
            petImageView.setImageResource(R.drawable.image4)
            //update the clean comment
            tomTextView.text = "thanks for cleaning me i fell so good,please play with me"
        }
        //change the pets image to match play action icon
        playButton.setOnClickListener {
            petImageView.setImageResource(R.drawable.image3)
            //update the play comment
            tomTextView.text = "it was nice playing with you"
        }

    }
}