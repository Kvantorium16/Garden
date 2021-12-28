package com.example.garden.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.garden.model.PlantCategory
import com.example.garden.R

class PlantCategoryAdapter(private val newPlantCategory: ArrayList<PlantCategory>) : RecyclerView.Adapter<PlantCategoryAdapter.CategoryPlantViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryPlantViewHolder {
        val  itemView = LayoutInflater.from((parent.context)).inflate(R.layout.plant_category, parent, false)
        return CategoryPlantViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CategoryPlantViewHolder, position: Int) {
        val currentItem = newPlantCategory[position]
        holder.titleIm.setImageResource(currentItem.titleIm)
        holder.TitleM.text = currentItem.mainTitle
        holder.titleD.text = currentItem.title_item_detail
    }

    override fun getItemCount(): Int {
        return newPlantCategory.size
    }
    class CategoryPlantViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleIm: ImageView = itemView.findViewById(R.id.titleIm)
    val TitleM: TextView = itemView.findViewById(R.id.mainTitle)
    val titleD: TextView = itemView.findViewById(R.id.title_item_detail)
    }
}