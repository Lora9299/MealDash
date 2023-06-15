package com.example.mealdash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Pizza : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.pepperoni,"Pepperoni Pizza","5€"))
        foodList.add(Food(R.drawable.napoletana, "Napoletana", "5.5€"))
        foodList.add(Food(R.drawable.margherita, "Margherita", "4.5€"))
        foodList.add(Food(R.drawable.capricosa, "Capricosa", "5€"))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

    foodAdapter.onItemClick = {
        val intent = Intent(this, Added::class.java)
        intent.putExtra("food", it)
        startActivity(intent)
    }

    }



}