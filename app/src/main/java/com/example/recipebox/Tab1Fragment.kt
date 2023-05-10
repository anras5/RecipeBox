package com.example.recipebox

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import androidx.fragment.app.ListFragment


class Tab1Fragment : ListFragment() {

    lateinit var listener: Listener
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val names: MutableList<String> = arrayListOf()
        for (i in Recipe.recipes.indices) {
            names.add(Recipe.recipes[i].name)
        }

        val adapter: Any = ArrayAdapter<Any?>(
            inflater.context,
            android.R.layout.simple_list_item_1,
            names as List<Any?>
        )
        listAdapter = adapter as ListAdapter?
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.listener = context as Listener
    }

    override fun onListItemClick(
        listView: ListView,
        itemView: View,
        position: Int,
        id: Long
    ) {
        listener.itemClicked(id)
    }
}