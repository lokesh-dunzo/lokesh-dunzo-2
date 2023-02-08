package com.example.lokesh_dunzo_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.concurrent.Flow
import java.util.concurrent.RecursiveTask

class FlowerAdapter(val flowerList:Array<String>) : RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {
    class FlowerViewHolder(viewItem : View) : RecyclerView.ViewHolder(viewItem){
        private val flowerTextView : TextView = viewItem.findViewById(R.id.flower_item)

        fun bind(s : String){
            flowerTextView.text = s;
        }
    }

    override fun getItemCount(): Int {
        return flowerList.size;
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.flower_iem, parent, false)

        return FlowerViewHolder(view);
    }

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerList[position]);
    }
}