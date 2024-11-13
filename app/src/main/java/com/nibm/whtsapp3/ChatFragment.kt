package com.nibm.whtsapp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChatFragment : Fragment() {

    private val dataset = arrayOf("January", "February", "March","april", "may", "june","july",
        "August","September","October","November","December")
    private val customAdapter = CustomAdapter(dataset)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chat, container, false)

        // Find the RecyclerView in the inflated view
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)

        // Set the layout manager and adapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = customAdapter

        return view
    }
}
