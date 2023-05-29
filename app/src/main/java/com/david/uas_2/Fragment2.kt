package com.david.uas_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.david.uas_2.databinding.Fragment1Binding
import com.david.uas_2.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = Fragment2Binding.inflate(inflater, container, false)
        binding.button2.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_fragment2_to_layanan)
        }
        binding.button5.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_fragment2_to_layanan2)
        }
        binding.button4.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_fragment2_to_layanan3)
        }
        return binding.root
    }



}