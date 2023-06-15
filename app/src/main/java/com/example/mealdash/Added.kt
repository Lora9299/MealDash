package com.example.mealdash

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Added : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_added)

        val food = intent.getParcelableExtra<Food>("food")

        if (food != null) {
            val textView: TextView = findViewById(R.id.added)
            val imageView: ImageView = findViewById(R.id.addedImage)
            textView.text = food.name
            imageView.setImageResource(food.image)
        }

    }
}