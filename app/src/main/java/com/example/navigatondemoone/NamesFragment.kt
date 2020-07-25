package com.example.navigatondemoone

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.navigation.NavController
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_names.*


class NamesFragment : Fragment() , View.OnClickListener{
    var navController : NavController?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_names, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)

        view.findViewById<Button>(R.id.button2).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.button2->{
                if(!TextUtils.isEmpty(editTextTextPersonName.text.toString())&& !TextUtils.isEmpty(editTextTextPersonName2.text.toString())){
                    val bundle= bundleOf("first_name" to editTextTextPersonName.text.toString(), "last_name" to editTextTextPersonName2.text.toString())
                    navController!!.navigate(R.id.action_namesFragment_to_displayFragment, bundle)
                }

            }
        }

    }


}