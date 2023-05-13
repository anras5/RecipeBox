package com.example.recipebox

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val frag: RecipeDetailFragment = supportFragmentManager.findFragmentById(R.id.detail_frag) as RecipeDetailFragment
        val recipeId = intent.extras?.getLong(EXTRA_RECIPE_ID)
        if (recipeId != null) {
            frag.setRecipe(recipeId)
        }

        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        val actionBar: ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
    }

    companion object {
        const val EXTRA_RECIPE_ID = "id"
    }


}