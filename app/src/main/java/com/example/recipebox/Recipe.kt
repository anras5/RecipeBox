package com.example.recipebox

class Recipe(id: Int, name: String, ingredients: String, actions: String, minutes: Int, imageId: Int, type: String) {

    var id: Int
    var name: String
    var ingredients: String
    var actions: String
    var minutes: Int
    var imageId: Int
    var type: String


    init {
        this.id = id
        this.name = name
        this.ingredients = ingredients
        this.actions = actions
        this.minutes = minutes
        this.imageId = imageId
        this.type = type
    }

    companion object {
        var recipes = arrayListOf(
            Recipe(
                101,
                "Spaghetti Aglio e Olio",
                "[ \"Spaghetti\", \"Olive oil\", \"Minced garlic\", \"Red pepper flakes\" , \"Parmesan cheese\", \"chopped parsley\"]",
                "Cook spaghetti according to package instructions.\n" +
                        "Heat olive oil in a pan over medium heat.\n" +
                        "Add minced garlic and red pepper flakes and cook until fragrant.\n" +
                        "Add the cooked spaghetti to the pan and toss to coat in the garlic oil.\n" +
                        "Serve with grated Parmesan cheese and chopped parsley.",
                30,
                R.drawable.spaghetti_aglio_e_olio,
                "dish"
            ),
            Recipe(
                102,
                "Classic Margherita Pizza",
                "[ \"Pizza dough\", \"Tomato sauce\", \"Mozzarella cheese\", \"Fresh basil leaves\" ]",
                "Preheat oven to 475°F (245°C). Roll out the pizza dough into a circle.\n" +
                        "Spread tomato sauce over the dough.\n" +
                        "Top with mozzarella cheese and fresh basil leaves.\n" +
                        "Bake in the preheated oven until crust is crispy and cheese is melted, about 10-12 minutes.",
                45,
                R.drawable.classic_margherita_pizza,
                "dish"
            ),
            Recipe(
                103,
                "Beef Stroganoff",
                "[ \"Egg noodles\", \"Butter\", \"Sliced mushrooms\", \"Minced garlic\", \"Beef sirloin strips\", \"Flour\", \"Beef broth\", \"Sour cream\", \"Chopped parsley\" ]",
                "Cook egg noodles according to package instructions.\n" +
                        "Melt butter in a large skillet over medium heat.\n" +
                        "Add sliced mushrooms and minced garlic, and cook until mushrooms are tender.\n" +
                        "Add beef sirloin strips and cook until browned.\n" +
                        "Stir in flour and beef broth and bring to a simmer.\n" +
                        "Stir in sour cream and cook until heated through.\n" +
                        "Serve over cooked egg noodles and garnish with chopped parsley.",
                60,
                R.drawable.beef_stroganoff,
                "dish"
            ),
            Recipe(
                104,
                "Chicken Parmesan",
                "[ \"Boneless, skinless chicken breasts\", \"Egg\", \"Breadcrumbs\", \"Parmesan cheese\", \"Mozzarella cheese\", \"Marinara sauce\" ]",
                "Preheat oven to 375°F (190°C).\n" +
                        "Dip chicken breasts in beaten egg, then coat in breadcrumbs mixed with Parmesan cheese.\n" +
                        "Bake chicken in the preheated oven for 25-30 minutes.\n" +
                        "Top chicken with marinara sauce and mozzarella cheese.\n" +
                        "Bake for an additional 5-10 minutes, until cheese is melted and bubbly.",
                50,
                R.drawable.chicken_parmesan,
                "dish"
            ),
            Recipe(
                105,
                "Beef and Broccoli Stir-Fry",
                "[ \"Flank steak\", \"Cornstarch\", \"Soy sauce\", \"Brown sugar\", \"Minced garlic\", \"Broccoli florets\", \"Sesame oil\", \"Sesame seeds\" ]",
                "Slice flank steak thinly and coat in cornstarch.\n" +
                        "Mix soy sauce, brown sugar, and minced garlic together.\n" +
                        "Stir-fry the beef slices in a hot skillet until browned.\n" +
                        "Remove beef from the skillet and set aside.\n" +
                        "In the same skillet, stir-fry broccoli florets in sesame oil until tender.\n" +
                        "Return the beef to the skillet and pour in the soy sauce mixture.\n" +
                        "Stir everything together and cook for a few more minutes.\n" +
                        "Sprinkle with sesame seeds before serving.",
                35,
                R.drawable.beef_and_broccoli_stir_fry,
                "dish"
            ),
            Recipe(
                106,
                "Pasta Carbonara",
                "[ \"Spaghetti\", \"Bacon\", \"Egg yolks\", \"Grated Parmesan cheese\", \"Minced garlic\", \"Ground black pepper\", \"Chopped parsley\" ]",
                "Cook spaghetti according to package instructions.\n" +
                        "In a separate pan, cook bacon until crispy.\n" +
                        "In a bowl, whisk together egg yolks, grated Parmesan cheese, minced garlic, and ground black pepper.\n" +
                        "Drain cooked spaghetti and immediately toss with the egg mixture.\n" +
                        "Add the crispy bacon and mix well.\n" +
                        "Garnish with chopped parsley before serving.",
                25,
                R.drawable.pasta_carbonara,
                "dish"
            ),
            Recipe(
                107,
                "Vegetable Curry",
                "[ \"Mixed vegetables\", \"Coconut milk\", \"Curry powder\", \"Minced ginger\", \"Minced garlic\", \"Onion\", \"Vegetable broth\" ]",
                "In a large pot, sauté minced ginger, minced garlic, and diced onion until fragrant.\n" +
                        "Add mixed vegetables and cook until slightly tender.\n" +
                        "Stir in curry powder and cook for a minute.\n" +
                        "Pour in coconut milk and vegetable broth, and simmer until vegetables are fully cooked.\n" +
                        "Serve with rice or naan bread.",
                40,
                R.drawable.vegetable_curry,
                "dish"
            ),
            Recipe(
                108,
                "Grilled Salmon",
                "[ \"Salmon fillets\", \"Lemon\", \"Olive oil\", \"Minced garlic\", \"Dried dill\", \"Salt\", \"Ground black pepper\" ]",
                "Preheat grill to medium-high heat.\n" +
                        "Rub salmon fillets with olive oil and minced garlic.\n" +
                        "Squeeze lemon juice over the fillets and sprinkle with dried dill, salt, and ground black pepper.\n" +
                        "Grill the salmon for 4-5 minutes per side, until it flakes easily with a fork.\n" +
                        "Serve with additional lemon wedges.",
                20,
                R.drawable.grilled_salmon,
                "dish"
            ),
            Recipe(
                109,
                "Mushroom Risotto",
                "[ \"Arborio rice\", \"Sliced mushrooms\", \"Minced shallot\", \"Minced garlic\", \"Vegetable broth\", \"White wine\", \"Grated Parmesan cheese\", \"Chopped parsley\" ]",
                "In a large pot, sauté minced shallot and minced garlic until fragrant.\n" +
                        "Add sliced mushrooms and cook until tender.\n" +
                        "Stir in Arborio rice and cook for a minute.\n" +
                        "Pour in white wine and cook until it's absorbed.\n" +
                        "Gradually add vegetable broth, stirring constantly, until the rice is cooked and creamy.\n" +
                        "Stir in grated Parmesan cheese and chopped parsley.\n" +
                        "Serve hot.",
                30,
                R.drawable.mushroom_risotto,
                "dish"
            ),
            Recipe(
                110,
                "Banana Bread",
                "[ \"Ripe bananas\", \"Flour\", \"Sugar\", \"Butter\", \"Egg\", \"Baking soda\", \"Vanilla extract\", \"Chopped walnuts\" ]",
                "Preheat oven to 350°F (175°C).\n" +
                        "In a bowl, mash ripe bananas with a fork.\n" +
                        "In a separate bowl, cream together sugar and softened butter.\n" +
                        "Add the mashed bananas, egg, baking soda, and vanilla extract to the butter mixture.\n" +
                        "Gradually add flour and mix until just combined.\n" +
                        "Fold in chopped walnuts.\n" +
                        "Pour the batter into a greased loaf pan and bake for about 60 minutes, or until a toothpick inserted into the center comes out clean.\n" +
                        "Allow the banana bread to cool before slicing.",
                75,
                R.drawable.banana_bread,
                "dessert"
            ),
            Recipe(
                201,
                "Chocolate Chip Cookies",
                "[ \"Flour\", \"Butter\", \"Sugar\", \"Brown sugar\", \"Egg\", \"Vanilla extract\", \"Baking soda\", \"Salt\", \"Chocolate chips\" ]",
                "Preheat oven to 375°F (190°C).\n" +
                        "In a bowl, cream together butter, sugar, and brown sugar.\n" +
                        "Beat in the egg and vanilla extract.\n" +
                        "In a separate bowl, whisk together flour, baking soda, and salt.\n" +
                        "Gradually add the dry ingredients to the butter mixture and mix until well combined.\n" +
                        "Fold in chocolate chips.\n" +
                        "Drop rounded spoonfuls of dough onto a greased baking sheet.\n" +
                        "Bake for about 10-12 minutes, or until golden brown.\n" +
                        "Allow the cookies to cool on the baking sheet for a few minutes before transferring to a wire rack to cool completely.",
                20,
                R.drawable.chocolate_chip_cookies,
                "dessert"
            ),
            Recipe(
                202,
                "Vanilla Cupcakes",
                "[ \"Flour\", \"Sugar\", \"Butter\", \"Egg\", \"Milk\", \"Vanilla extract\", \"Baking powder\", \"Salt\" ]",
                "Preheat oven to 350°F (175°C).\n" +
                        "In a bowl, cream together butter and sugar until light and fluffy.\n" +
                        "Beat in the egg and vanilla extract.\n" +
                        "In a separate bowl, whisk together flour, baking powder, and salt.\n" +
                        "Gradually add the dry ingredients to the butter mixture, alternating with milk.\n" +
                        "Mix until just combined.\n" +
                        "Line a muffin tin with cupcake liners and fill each liner about two-thirds full with batter.\n" +
                        "Bake for about 18-20 minutes, or until a toothpick inserted into the center comes out clean.\n" +
                        "Allow the cupcakes to cool completely before frosting.",
                30,
                R.drawable.vanilla_cupcakes,
                "dessert"
            ),
            Recipe(
                203,
                "Apple Pie",
                "[ \"Pie crust\", \"Apples\", \"Sugar\", \"Flour\", \"Cinnamon\", \"Nutmeg\", \"Lemon juice\", \"Butter\" ]",
                "Preheat oven to 425°F (220°C).\n" +
                        "In a bowl, combine sliced apples, sugar, flour, cinnamon, nutmeg, and lemon juice.\n" +
                        "Line a pie dish with a pie crust.\n" +
                        "Pour the apple mixture into the crust and dot with butter.\n" +
                        "Cover the pie with a second crust and seal the edges.\n" +
                        "Cut slits in the top crust to allow steam to escape.\n" +
                        "Bake for about 45-50 minutes, or until the crust is golden brown and the filling is bubbly.\n" +
                        "Allow the pie to cool before serving.",
                60,
                R.drawable.apple_pie,
                "dessert"
            ),
            Recipe(
                301,
                "Strawberry Shortcake",
                "[ \"Strawberries\", \"Granulated sugar\", \"All-purpose flour\", \"Baking powder\", \"Salt\", \"Unsalted butter\", \"Milk\", \"Whipped cream\" ]",
                "Preheat the oven to 425°F (220°C). Line a baking sheet with parchment paper.\n" +
                        "In a mixing bowl, combine sliced strawberries with granulated sugar. Let it sit for about 30 minutes to macerate.\n" +
                        "In another bowl, whisk together flour,baking powder, and salt. Cut in cold butter using a pastry cutter until the mixture resembles coarse crumbs.\n" +
                        "Add milk and stir until the dough comes together. Turn the dough out onto a floured surface and knead it lightly.\n" +
                        "Pat the dough into a 1-inch thick rectangle and cut out round biscuits using a biscuit cutter.\n" +
                        "Place the biscuits onto the prepared baking sheet and bake for 12-15 minutes, or until golden brown.\n" +
                        "Allow the biscuits to cool slightly. Slice them in half horizontally and fill with macerated strawberries and whipped cream.\n" +
                        "Place the top half of the biscuit over the filling and serve.",
                45,
                R.drawable.strawberry_shortcake,
                "dessert"
            ),
            Recipe(
                302,
                "Blueberry Muffins",
                "[ \"All-purpose flour\", \"Granulated sugar\", \"Baking powder\", \"Salt\", \"Unsalted butter\", \"Egg\", \"Milk\", \"Vanilla extract\", \"Blueberries\" ]",
                "Preheat the oven to 375°F (190°C). Line a muffin tin with paper liners.\n" +
                        "In a mixing bowl, whisk together flour, sugar, baking powder, and salt.\n" +
                        "In another bowl, cream together butter and sugar until light and fluffy. Beat in the egg, milk, and vanilla extract.\n" +
                        "Gradually add the dry ingredients to the butter mixture and mix until just combined. Fold in the blueberries.\n" +
                        "Spoon the batter into the prepared muffin tin, filling each cup about two-thirds full.\n" +
                        "Bake for 18-20 minutes, or until a toothpick inserted into the center comes out clean.\n" +
                        "Allow the muffins to cool in the tin for 5 minutes, then transfer to a wire rack to cool completely.",
                30,
                R.drawable.blueberry_muffins,
                "dessert"
            ),
            Recipe(
                303,
                "Vanilla Custard",
                "[ \"Milk\", \"Granulated sugar\", \"Cornstarch\", \"Egg yolks\", \"Vanilla extract\" ]",
                "In a saucepan, heat milk over medium heat until it starts to steam.\n" +
                        "In a separate bowl, whisk together sugar, cornstarch, and egg yolks until well combined.\n" +
                        "Slowly pour the hot milk into the egg mixture while whisking continuously.\n" +
                        "Return the mixture to the saucepan and cook over medium heat, stirring constantly, until the custard thickens.\n" +
                        "Remove the saucepan from heat and stir in vanilla extract.\n" +
                        "Pour the custard into individual serving dishes and let it cool.\n" +
                        "Refrigerate the custard for at least 2 hours, or until chilled and set.",
                20,
                R.drawable.vanilla_custard,
                "dessert"
            ),
            Recipe(
                401,
                "Chocolate Lava Cake",
                "[ \"Unsalted butter\", \"Semisweet chocolate\", \"Granulated sugar\", \"Egg\", \"Vanilla extract\", \"All-purpose flour\", \"Salt\", \"Powdered sugar\", \"Whipped cream\" ]",
                "Preheat the oven to 425°F (220°C). Grease and flour individual ramekins or oven-safe bowls.\n" +
                        "In a microwave-safe bowl, melt the butter and semisweet chocolate together in 30-second intervals, stirring in between, until smooth.\n" +
                        "In another bowl, whisk together granulated sugar, egg, and vanilla extract. Add the melted chocolate mixture and stir until combined.\n" +
                        "Fold in flour and salt until just combined. Be careful not to overmix.\n" +
                        "Divide the batter equally among the prepared ramekins.\n" +
                        "Bake for 12-14 minutes, or until the edges are set but the center is still slightly jiggly.\n" +
                        "Allow the lava cakes to cool for a few minutes. Invert the ramekins onto serving plates and remove them.\n" +
                        "Dust with powdered sugar and serve with a dollop of whipped cream.",
                25,
                R.drawable.chocolate_lava_cake,
                "dessert"
            ),
            Recipe(
                402,
                "Peanut Butter Cookies",
                "[ \"All-purpose flour\", \"Baking soda\", \"Salt\", \"Unsalted butter\", \"Creamy peanut butter\", \"Granulated sugar\", \"Brown sugar\", \"Egg\", \"Vanilla extract\" ]",
                "Preheat the oven to 375°F (190°C). Line a baking sheet with parchment paper.\n" +
                        "In a mixing bowl, whisk together flour, baking soda, and salt.\n" +
                        "In another bowl, cream together butter, peanut butter, granulated sugar, and brown sugar until light and fluffy.\n" +
                        "Beat in the egg and vanilla extract until well combined.\n" +
                        "Gradually add the dry ingredients to the butter mixture and mix until just combined.\n" +
                        "Roll the dough into 1-inch balls and place them on the prepared baking sheet.\n" +
                        "Press each ball with a fork to create a crisscross pattern.\n" +
                        "Bake for 10-12 minutes, or until the edges are lightly golden.\n" +
                        "Allow the cookies to cool on the baking sheet for a few minutes, then transfer to a wire rack to cool completely.",
                20,
                R.drawable.peanut_butter_cookies,
                "dessert"
            )

        )
    }
}
