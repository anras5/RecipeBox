package com.example.recipebox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class RecipeDetailFragment : Fragment() {
    var recipeId: Long = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_recipe_detail, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (savedInstanceState != null) {
            recipeId = savedInstanceState.getLong("recipeId")
        } else {
            val timer = TimerFragment()
            val ft = childFragmentManager.beginTransaction()
            ft.add(R.id.timer_container, timer)
            ft.addToBackStack(null)
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            ft.commit()
        }
    }

    fun setRecipe(id: Long?) {
        if (id != null) {
            this.recipeId = id
        }
    }

    override fun onStart() {
        super.onStart()
        val view: View? = view
        if (view != null) {
            println("Hello")
            val title: TextView = view.findViewById(R.id.textTitle)
            val dbHandler = DBHandler(requireContext(),null, null, 1)
            println(recipeId.toInt())
            val recipe: Recipe? = dbHandler.findRecipe(recipeId.toInt())
            if (recipe != null) {
                println(recipe.id)
                title.text = recipe.name
                val description: TextView = view.findViewById(R.id.textDescription)
                description.text = recipe.actions

                val preparationTime: TextView = view.findViewById(R.id.textPreparationTime)
                preparationTime.text = "Preparation time: ${recipe.minutes} minutes"

                val frag: TimerFragment =
                    childFragmentManager.findFragmentById(R.id.timer_container) as TimerFragment
                frag.setPreparaionSeconds(recipe.minutes)

                val fab: FloatingActionButton = view.findViewById(R.id.fab)
                fab.setOnClickListener { onClickDone(view) }

                val imageView: ImageView = view.findViewById<ImageView>(R.id.image)
                imageView.setImageResource(recipe.imageId)
            } else {
                println("no sorki")
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putLong("recipeId", recipeId)
    }

    fun onClickDone(view: View) {
        val text: CharSequence = "To jest prosty pasek snackbar."
        val duration = Snackbar.LENGTH_SHORT
        val snackbar = Snackbar.make(view, text, duration)
        snackbar.setAction("Cofnij") {
            val toast = Toast.makeText(context, "Cofnięto!", Toast.LENGTH_SHORT)
            toast.show()
        }
        snackbar.show()
    }


}