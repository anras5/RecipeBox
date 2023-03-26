package com.example.recipebox

class Recipe(name: String, recipe: String) {

    var name: String
    var recipe: String


    init {
        this.name = name
        this.recipe = recipe
    }

    companion object {
        var recipes = arrayListOf<Recipe>(
            Recipe(
                "Pizza", "recipe"
            ),
            Recipe(
                "Spaghetti", "recipe spaghetti"
            ),
            Recipe(
                "bigos", "polish dish"
            ),
            Recipe(
                "some dish", "test test test"
            )
        )
    }
}
