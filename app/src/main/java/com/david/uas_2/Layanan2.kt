package com.david.uas_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.david.uas_2.databinding.FragmentLayanan2Binding
import com.david.uas_2.databinding.FragmentLayananBinding


class Layanan2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLayanan2Binding.inflate(inflater, container, false)
        binding.btn3.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_layanan2_to_fragment9)
        }
        binding.btn4.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_layanan2_to_fragment4)
        }
        return binding.root
    }


}