package com.example.recipebox

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import java.io.File


class MainActivity : AppCompatActivity(), Listener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val pagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val pager = findViewById<View>(R.id.pager) as ViewPager
        pager.adapter = pagerAdapter

        val tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(pager)

        // Generating Database (comment if not needed)
        var file = File("/data/data/com.example.recipebox/databases/recipeDB.db")
        file.delete()
        file = File("/data/data/com.example.recipebox/databases/recipeDB.db-journal")
        file.delete()
        val dbHandler = DBHandler(this,null, null, 1)
        for (recipe in Recipe.recipes) {
            dbHandler.addRecipe(recipe)
        }
    }

    override fun itemClicked(id: Long) {
        val fragmentContainer: View? = findViewById(R.id.fragment_container)
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
            intent.putExtra(DetailsActivity.EXTRA_RECIPE_ID, id)
            startActivity(intent)
        }
    }
}