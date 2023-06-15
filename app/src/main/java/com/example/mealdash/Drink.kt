package com.example.mealdash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Drink : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drink)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.cola,"Coca-Cola","2.9€"))
        foodList.add(Food(R.drawable.fanta, "Fanta", "2.8€"))
        foodList.add(Food(R.drawable.fiji, "Water", "2€"))
        foodList.add(Food(R.drawable.mocha, "Mocha Coffee", "2.5€"))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter


        foodAdapter.onItemClick = {
            val intent = Intent(this, Added::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }


    }
}