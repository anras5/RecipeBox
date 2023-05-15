package com.example.recipebox

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Tab1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val recipeRecycler =
            inflater.inflate(R.layout.fragment_tab1, container, false) as RecyclerView
        val recipeNames = Recipe.recipes.filter { it.type == "dish" }
            .map { it.name }
            .toTypedArray()
        val recipeImages = Recipe.recipes.filter { it.type == "dish" }
            .map { it.imageId }
            .toIntArray()
        val adapter = CaptionedImagesAdapter(recipeNames, recipeImages, Recipe.recipes.filter { it.type == "dish" }.toTypedArray())
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