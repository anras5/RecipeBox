package com.example.recipebox

class Recipe(name: String, recipe: String, minutes: Int, imageId: Int) {

    var name: String
    var recipe: String
    var minutes: Int
    var imageId: Int


    init {
        this.name = name
        this.recipe = recipe
        this.minutes = minutes
        this.imageId = imageId
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
                30,
                R.drawable.rec1
            ),
            Recipe(
                "Chicken Caesar Salad",
                "Cook chicken breasts on a grill or stovetop until fully cooked.\n" +
                        "Toss chopped Romaine lettuce with Caesar dressing.\n" +
                        "Top the lettuce with the cooked chicken and sprinkle with shredded Parmesan cheese and croutons.",
                15,
                R.drawable.rec2
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
                5,
                R.drawable.rec3
            ),
            Recipe(
                "Grilled Cheese Sandwich",
                "Butter two slices of bread.\n" +
                        "Place a slice of cheese between the two slices of bread, with the buttered sides facing out.\n" +
                        "Heat a pan over medium heat and add the sandwich.\n" +
                        "Cook for a few minutes on each side until the bread is toasted and the cheese is melted.",
                20,
                R.drawable.rec4
            ),
            Recipe(
                "Baked Salmon",
                "Preheat the oven to 375°F.\n" +
                        "Place salmon fillets on a baking sheet lined with parchment paper.\n" +
                        "Brush the salmon with olive oil and season with salt, pepper, and herbs of your choice (e.g. dill, thyme).\n" +
                        "Bake for 12-15 minutes, until the salmon is fully cooked and flakes easily with a fork.",
                25,
                R.drawable.rec5
            ),

            Recipe(
                "Baked Salmon with Lemon and Dill",
                "Preheat the oven to 400°F.\n" +
                        "Season salmon fillets with salt and pepper and place on a baking sheet.\n" +
                        "Top each fillet with a slice of lemon and a sprig of fresh dill.\n" +
                        "Bake in the oven for 12-15 minutes until the salmon is cooked through.\n" +
                        "Serve with a side of roasted vegetables.",
                25,
                R.drawable.rec6
            ),
            Recipe(
                "Beef Stir Fry",
                "Thinly slice beef and marinate in soy sauce and ginger for 30 minutes.\n" +
                        "Heat a wok or large skillet over high heat.\n" +
                        "Add the marinated beef and stir fry for 2-3 minutes.\n" +
                        "Add sliced vegetables (such as bell peppers and onions) and continue stir frying for an additional 2-3 minutes.\n" +
                        "Serve over rice or noodles.",
                40,
                R.drawable.rec7
            ),
            Recipe(
                "Vegetarian Chili",
                "Heat olive oil in a large pot over medium heat.\n" +
                        "Add chopped onions, bell peppers, and garlic and cook until softened.\n" +
                        "Add canned diced tomatoes, tomato sauce, and a can of beans (such as kidney or black beans).\n" +
                        "Stir in chili powder, cumin, and smoked paprika.\n" +
                        "Let simmer for 30-45 minutes until the flavors have melded together.\n" +
                        "Serve with shredded cheese and sour cream on top.",
                50,
                R.drawable.rec8
            ),
            Recipe(
                "Roasted Chicken Thighs",
                "Preheat the oven to 425°F.\n" +
                        "Season chicken thighs with salt, pepper, and dried herbs (such as thyme or rosemary).\n" +
                        "Place the chicken on a baking sheet and drizzle with olive oil.\n" +
                        "Roast in the oven for 25-30 minutes until the chicken is cooked through.\n" +
                        "Serve with a side of roasted vegetables or a simple green salad.",
                35,
                R.drawable.rec9
            ),
            Recipe(
                "Spicy Shrimp Pasta",
                "Cook spaghetti according to package instructions.\n" +
                        "Heat olive oil in a pan over medium heat.\n" +
                        "Add minced garlic and red pepper flakes and cook until fragrant.\n" +
                        "Add raw shrimp to the pan and cook until pink.\n" +
                        "Toss the cooked spaghetti with the shrimp and garlic oil.\n" +
                        "Serve with chopped fresh parsley.",
                25,
                R.drawable.rec10
            ),
            Recipe(
                "Roasted Vegetable Medley",
                "Preheat oven to 400°F.\n" +
                        "Cut your choice of vegetables into bite-sized pieces and toss with olive oil, salt, and pepper.\n" +
                        "Spread the vegetables evenly on a baking sheet and roast for 20-25 minutes, or until tender and slightly caramelized.\n" +
                        "Serve as a side dish or over quinoa or rice for a full meal.",
                35,
                R.drawable.rec11
            ),
            Recipe(
                "Easy Lentil Soup",
                "In a large pot, heat olive oil over medium heat.\n" +
                        "Add chopped onions, carrots, and celery and sauté until softened.\n" +
                        "Add vegetable broth, lentils, canned tomatoes, and your choice of seasonings (such as cumin, paprika, and bay leaves).\n" +
                        "Bring to a simmer and cook until lentils are tender, about 30 minutes.\n" +
                        "Serve with a side of bread for dipping.",
                45,
                R.drawable.rec12
            ),
            Recipe(
                "Sheet Pan Fajitas",
                "Preheat oven to 400°F.\n" +
                        "Slice bell peppers and onions into thin strips and spread on a baking sheet.\n" +
                        "Season with chili powder, cumin, garlic powder, salt, and pepper, and toss to coat.\n" +
                        "Add sliced chicken or steak to the baking sheet, and toss again.\n" +
                        "Bake for 25-30 minutes, or until meat is fully cooked.\n" +
                        "Serve with tortillas, salsa, and avocado.",
                40,
                R.drawable.rec13
            ),
            Recipe(
                "Creamy Tomato Soup",
                "In a large pot, heat olive oil over medium heat.\n" +
                        "Add chopped onions and garlic and sauté until fragrant.\n" +
                        "Add canned tomatoes, vegetable broth, and your choice of seasonings (such as basil, oregano, and thyme).\n" +
                        "Bring to a simmer and cook for 10-15 minutes.\n" +
                        "Use an immersion blender to blend the soup until smooth.\n" +
                        "Stir in heavy cream or coconut milk, and heat until warmed through.",
                30,
                R.drawable.rec14
            ),
            Recipe(
                "Honey Mustard Salmon",
                "Preheat oven to 375°F.\n" +
                        "In a small bowl, whisk together Dijon mustard, honey, minced garlic, and olive oil.\n" +
                        "Brush the mixture onto salmon fillets.\n" +
                        "Bake for 15-20 minutes, or until salmon is fully cooked.\n" +
                        "Serve with a side of roasted vegetables or a salad.",
                25,
                R.drawable.rec15
            )

        )
    }
}
