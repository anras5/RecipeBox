package com.example.recipebox

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import androidx.fragment.app.ListFragment


class Tab1Fragment : ListFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val adapter: Any = ArrayAdapter<Any?>(
            inflater.context,
            android.R.layout.simple_list_item_1,
            resources.getStringArray(R.array.kategoria1)
        )
        listAdapter = adapter as ListAdapter?
        return super.onCreateView(inflater, container, savedInstanceState)!!
    }
}