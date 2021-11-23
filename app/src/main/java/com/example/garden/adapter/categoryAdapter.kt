package com.example.garden.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.garden.R
import com.example.garden.model.Category


class categoryAdapter(private val newCategory: ArrayList<Category>) : RecyclerView.Adapter<categoryAdapter.CategoryViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): categoryAdapter.CategoryViewHolder {
        val itemView =
            LayoutInflater.from((parent.context)).inflate(R.layout.category_item, parent, false)
        return categoryAdapter.CategoryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: categoryAdapter.CategoryViewHolder, position: Int) {
        val currentItem = newCategory[position]
        holder.Id.setImageResource(currentItem.Id)
        holder.titleId.text = currentItem.CategoryTitle


    }

    override fun getItemCount(): Int {
        return newCategory.size
    }

    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val Id: ImageView = itemView.findViewById(R.id.Id)
        val titleId: TextView = itemView.findViewById(R.id.CategoryTitle)

    }
}