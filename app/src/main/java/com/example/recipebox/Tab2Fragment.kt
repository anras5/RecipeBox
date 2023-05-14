package com.example.recipebox

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import androidx.fragment.app.ListFragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Tab2Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val recipeRecycler = inflater.inflate(R.layout.fragment_tab2, container, false) as RecyclerView
        val recipeNames = Recipe.recipes.filter { it.type == "dessert" }
            .map { it.name }
            .toTypedArray()
        val recipeImages = Recipe.recipes.filter { it.type == "dessert" }
            .map { it.imageId }
            .toIntArray()
        val adapter = CaptionedImagesAdapter(recipeNames, recipeImages, Recipe.recipes.filter { it.type == "dessert" }.toTypedArray())
        recipeRecycler.adapter = adapter

        val layoutManager = GridLayoutManager(activity, 2)
        recipeRecycler.layoutManager = layoutManager

        adapter.setListener(object : CaptionedImagesAdapter.Listener {
            override fun onClick(recipe: Recipe) {
                val intent = Intent(activity, DetailsActivity::class.java)
                intent.putExtra(DetailsActivity.EXTRA_RECIPE_ID, recipe.id.toLong())
                activity?.startActivity(intent)
            }
        })

        return recipeRecycler
    }
}