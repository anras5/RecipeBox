package com.example.recipebox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recipesRecyclerView: RecyclerView
    lateinit var recipesListRecycler: MutableList<RecipeListItem>
    lateinit var recipesList: MutableList<Recipe>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recipesRecyclerView = findViewById(R.id.recyclerViewRecipes)
        recipesRecyclerView.layoutManager = LinearLayoutManager(this)
        recipesRecyclerView.setHasFixedSize(true)

        recipesListRecycler = arrayListOf<RecipeListItem>()

        recipesList = mutableListOf()
        recipesList.add(
            Recipe(
                1,
                "Pizza",
                60,
                "A delicious Italian dish consisting of a thin or thick crust, topped with tomato sauce, cheese, and various toppings such as meat, vegetables, or herbs."
            )
        )
        recipesList.add(
            Recipe(
                2,
                "Bigos",
                180,
                "Bigos is a traditional Polish stew made with sauerkraut, various meats, and sometimes mushrooms or prunes, simmered for hours with spices and often served with bread or potatoes."
            )
        )
        recipesList.add(
            Recipe(
                3,
                "Spaghetti",
                30,
                "Spaghetti is a long, thin pasta of Italian origin, typically served with a tomato-based sauce and often accompanied by meatballs, grated cheese, or other toppings"
            )
        )

        getData()

    }

    private fun getData() {
        for (recipe in recipesList) {
            recipesListRecycler.add(
                RecipeListItem(
                    recipe.id,
                    recipe.name,
                    recipe.timeInMinutes
                )
            )
        }

        recipesRecyclerView.adapter = RecipesAdapter(recipesListRecycler)

    }
}