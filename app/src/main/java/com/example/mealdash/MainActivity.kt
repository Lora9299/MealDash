package com.example.mealdash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pizza = findViewById<ImageButton>(R.id.imageButton2)

        pizza.setOnClickListener {
            val intent = Intent(this, Pizza::class.java)
            startActivity(intent)
        }

        val burger = findViewById<ImageButton>(R.id.imageButton3)

        burger.setOnClickListener {
            val intent = Intent(this, Burger::class.java)
            startActivity(intent)
        }

        val drink = findViewById<ImageButton>(R.id.imageButton4)

        drink.setOnClickListener {
            val intent = Intent(this, Drink::class.java)
            startActivity(intent)
        }

        val dessert = findViewById<ImageButton>(R.id.imageButton5)

        dessert.setOnClickListener {
            val intent = Intent(this, Dessert::class.java)
            startActivity(intent)
        }


    }
}