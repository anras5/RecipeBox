package com.example.recipebox

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class RecipesAdapter(private val recipeListItem: MutableList<RecipeListItem>) :
    RecyclerView.Adapter<RecipesAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = recipeListItem[position]
        holder.tvNumber.text = currentItem.number.toString()
        holder.tvRecipeName.text = "Recipe: ${currentItem.name}"
        holder.tvTimeToPrepare.text = "Time to prepare in minutes: ${currentItem.timeInMinutes}"
    }

    override fun getItemCount(): Int {
        return recipeListItem.size
    }

    class MyViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        val tvNumber: TextView = itemView.findViewById(R.id.txtNumber)
        val tvRecipeName: TextView = itemView.findViewById(R.id.txtRecipeName)
        val tvTimeToPrepare: TextView = itemView.findViewById(R.id.txtTimeToPrepare)
    }

}