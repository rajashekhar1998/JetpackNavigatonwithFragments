package com.example.navigatondemoone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavController


class DisplayFragment : Fragment() {


    var first_name:String?=null
    var last_name:String?=null //lateinit var last_name:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        first_name= arguments?.getString("first_name")
        last_name= arguments?.getString("last_name")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name="Full name is $first_name $last_name"
        view.findViewById<TextView>(R.id.textView).text = name
    }
}