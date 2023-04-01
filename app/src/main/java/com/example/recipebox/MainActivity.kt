package com.example.recipebox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), Listener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun itemClicked(id: Long) {
        val fragmentContainer: View = findViewById(R.id.fragment_container)
        if (fragmentContainer != null) {
            val details = RecipeDetailFragment()
            val ft = supportFragmentManager.beginTransaction()
            details.setRecipe(id)
            ft.replace(R.id.fragment_container, details)
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            ft.addToBackStack(null);
            ft.commit()
        } else {
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra(DetailsActivity.EXTRA_RECIPE_ID, id.toInt())
            startActivity(intent)
        }
    }
}