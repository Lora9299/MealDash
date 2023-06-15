package com.example.mealdash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Dessert : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.pancake,"Pancakes","2.5€"))
        foodList.add(Food(R.drawable.waffles, "Waffles", "2.5€"))
        foodList.add(Food(R.drawable.cupcakes, "Cupcakes", "2€"))
        foodList.add(Food(R.drawable.icecream, "Ice Cream", "1.5€"))

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

        foodAdapter.onItemClick = {
            val intent = Intent(this, Added::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }


    }
}