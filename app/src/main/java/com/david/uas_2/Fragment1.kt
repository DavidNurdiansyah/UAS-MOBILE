package com.david.uas_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.david.uas_2.databinding.Fragment1Binding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class Fragment1 : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = Fragment1Binding.inflate(inflater, container, false)
        binding.button.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_fragment1_to_fragment2)
        }
        return binding.root
    }
}