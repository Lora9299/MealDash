package com.example.mealdash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Burger : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.burger,"Burger","6€"))
        foodList.add(Food(R.drawable.veggieburger, "Vegetarian burger", "7€"))
        foodList.add(Food(R.drawable.wafflefries, "Waffle fries", "4.5€"))
        foodList.add(Food(R.drawable.wavyfries, "Wavy fries", "4€"))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

        foodAdapter.onItemClick = {
            val intent = Intent(this, Added::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }



    }
}