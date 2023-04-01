package com.example.recipebox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class RecipeDetailFragment : Fragment() {
    var recipeId: Long = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe_detail, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState != null) {
            recipeId = savedInstanceState.getLong("recipeId")
        }
    }

    fun setRecipe(id: Long) {
        this.recipeId = id
    }

    override fun onStart() {
        super.onStart()
        val view: View? = view
        if (view != null) {
            val title: TextView = view.findViewById(R.id.textTitle)
            val cocktail: Recipe = Recipe.recipes[recipeId.toInt()]
            title.text = cocktail.name
            val description: TextView = view.findViewById(R.id.textDescription)
            description.text = cocktail.recipe
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putLong("recipeId", recipeId)
    }
}