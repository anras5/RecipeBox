package com.example.recipebox

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Tab1Fragment : Fragment() {

//    lateinit var listener: Listener

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val recipeRecycler = inflater.inflate(R.layout.fragment_tab1, container, false) as RecyclerView
        val recipeNames = Array(Recipe.recipes.size) { i -> Recipe.recipes[i].name }
        val recipeImages = IntArray(Recipe.recipes.size) { i -> Recipe.recipes[i].imageId }
        val adapter = CaptionedImagesAdapter(recipeNames, recipeImages)
        recipeRecycler.adapter = adapter

        val layoutManager = GridLayoutManager(activity, 2)
        recipeRecycler.layoutManager = layoutManager

        adapter.setListener(object : CaptionedImagesAdapter.Listener {
            override fun onClick(position: Int) {
                val intent = Intent(activity, DetailsActivity::class.java)
                intent.putExtra(DetailsActivity.EXTRA_RECIPE_ID, position.toLong())
                activity?.startActivity(intent)
            }
        })

        return recipeRecycler
    }

//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        val names: MutableList<String> = arrayListOf()
//        for (i in Recipe.recipes.indices) {
//            names.add(Recipe.recipes[i].name)
//        }
//
//        val adapter: Any = ArrayAdapter<Any?>(
//            inflater.context,
//            android.R.layout.simple_list_item_1,
//            names as List<Any?>
//        )
//        listAdapter = adapter as ListAdapter?
//        return super.onCreateView(inflater, container, savedInstanceState)
//    }

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        this.listener = context as Listener
//    }

//    override fun onListItemClick(
//        listView: ListView,
//        itemView: View,
//        position: Int,
//        id: Long
//    ) {
//        listener.itemClicked(id)
//    }
}