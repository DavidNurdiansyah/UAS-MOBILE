package com.david.uas_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.david.uas_2.databinding.Fragment2Binding
import com.david.uas_2.databinding.FragmentLayananBinding


class Layanan : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLayananBinding.inflate(inflater, container, false)
        binding.btn1.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_layanan_to_fragment7)
        }
        binding.btn2.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_layanan_to_fragment3)
        }
        return binding.root
    }



}