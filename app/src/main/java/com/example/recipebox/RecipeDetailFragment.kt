package com.example.recipebox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class RecipeDetailFragment : Fragment() {
    var recipeId: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe_detail, container, false)
    }

    fun setRecipe(id: Long) {
        this.recipeId = id.toInt();
    }

    override fun onStart() {
        super.onStart()
        val view: View? = view
        if (view != null) {
            val title: TextView = view.findViewById(R.id.textTitle)
            val cocktail: Recipe = Recipe.recipes[recipeId]
            title.text = cocktail.name
            val description: TextView = view.findViewById(R.id.textDescription)
            description.text = cocktail.recipe
        }
    }
}