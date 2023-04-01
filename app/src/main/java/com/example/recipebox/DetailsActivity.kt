package com.example.recipebox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val frag: RecipeDetailFragment = supportFragmentManager.findFragmentById(R.id.detail_frag) as RecipeDetailFragment
        val recipeId = intent.extras?.get(EXTRA_RECIPE_ID)
        frag.setRecipe(recipeId as Long)
    }

    companion object {
        const val EXTRA_RECIPE_ID = "id"
    }


}