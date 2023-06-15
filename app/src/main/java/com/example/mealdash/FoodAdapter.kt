package com.example.mealdash

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList:ArrayList<Food>) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    var onItemClick : ((Food) -> Unit)? = null

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.findViewById(R.id.itemList)
        val textView: TextView = itemView.findViewById(R.id.listText)
        val priceView: TextView = itemView.findViewById(R.id.listPrice)
        val button: Button = itemView.findViewById(R.id.button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        holder.imageView.setImageResource(food.image)
        holder.textView.text = food.name
        holder.priceView.text = food.price

        holder.button.setOnClickListener {
            onItemClick?.invoke(food)
        }

    }

}