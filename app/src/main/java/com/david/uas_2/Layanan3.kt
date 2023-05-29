package com.david.uas_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.david.uas_2.databinding.FragmentLayanan3Binding
import com.david.uas_2.databinding.FragmentLayananBinding

class Layanan3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLayanan3Binding.inflate(inflater, container, false)
        binding.btn5.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_layanan3_to_fragment8)
        }
        binding.btn6.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_layanan3_to_fragment5)
        }
        return binding.root
    }


}