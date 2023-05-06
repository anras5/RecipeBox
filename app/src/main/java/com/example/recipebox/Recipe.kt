package com.example.recipebox

class Recipe(name: String, recipe: String, minutes: Int) {

    var name: String
    var recipe: String
    var minutes: Int


    init {
        this.name = name
        this.recipe = recipe
        this.minutes = minutes
    }

    companion object {
        var recipes = arrayListOf<Recipe>(
            Recipe(
                "Spaghetti Aglio e Olio",
                "Cook spaghetti according to package instructions.\n" +
                        "Heat olive oil in a pan over medium heat.\n" +
                        "Add minced garlic and red pepper flakes and cook until fragrant.\n" +
                        "Add the cooked spaghetti to the pan and toss to coat in the garlic oil.\n" +
                        "Serve with grated Parmesan cheese and chopped parsley.",
                30
            ),
            Recipe(
                "Chicken Caesar Salad",
                "Cook chicken breasts on a grill or stovetop until fully cooked.\n" +
                        "Toss chopped Romaine lettuce with Caesar dressing.\n" +
                        "Top the lettuce with the cooked chicken and sprinkle with shredded Parmesan cheese and croutons.",
                15
            ),
            Recipe(
                "Fried Rice",
                "Cook rice according to package instructions and let cool.\n" +
                        "Heat oil in a large pan or wok over high heat.\n" +
                        "Add diced vegetables (e.g. onions, carrots, peas) and cook until tender.\n" +
                        "Add the cooled rice to the pan and stir to combine with the vegetables.\n" +
                        "Push the rice and vegetables to the side of the pan and scramble an egg in the empty space.\n" +
                        "Mix the egg into the rice and vegetables.\n" +
                        "Season with soy sauce and serve.",
                5
            ),
            Recipe(
                "Grilled Cheese Sandwich",
                "Butter two slices of bread.\n" +
                        "Place a slice of cheese between the two slices of bread, with the buttered sides facing out.\n" +
                        "Heat a pan over medium heat and add the sandwich.\n" +
                        "Cook for a few minutes on each side until the bread is toasted and the cheese is melted.",
                20
            ),
            Recipe(
                "Baked Salmon",
                "Preheat the oven to 375°F.\n" +
                        "Place salmon fillets on a baking sheet lined with parchment paper.\n" +
                        "Brush the salmon with olive oil and season with salt, pepper, and herbs of your choice (e.g. dill, thyme).\n" +
                        "Bake for 12-15 minutes, until the salmon is fully cooked and flakes easily with a fork.",
                25
            )
        )
    }
}
