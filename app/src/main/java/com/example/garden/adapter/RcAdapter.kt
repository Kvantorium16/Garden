package com.example.garden.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.garden.model.Plant
import com.example.garden.R

class RcAdapter(private val newList: ArrayList<Plant>) :RecyclerView.Adapter<RcAdapter.ViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val  itemView = LayoutInflater.from((parent.context)).inflate(R.layout.plant_item, parent, false)
           return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = newList[position]
        holder.titleImage.setImageResource(currentItem.imageId)
        holder.title.text=currentItem.title
        holder.detail.text=currentItem.item_detail
    }

    override fun getItemCount(): Int {
        return newList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val titleImage : ImageView = itemView.findViewById(R.id.imageId)
        val title: TextView = itemView.findViewById(R.id.title)
        val detail: TextView = itemView.findViewById(R.id.item_detail)
    }


}