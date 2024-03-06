package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.databinding.FragmentAbout2Binding

class About2Fragment : Fragment() {

    private var _binding : FragmentAbout2Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_about2, container, false)

        _binding = FragmentAbout2Binding.inflate(inflater, container, false)

        binding.btnGetStarted.setOnClickListener {
            findNavController().navigate(R.id.action_aboutFragment_to_menuFragment)
        }

        return binding.root
    }

    /*private fun closeFragment() {
        requireActivity().supportFragmentManager.popBackStack()
    }*/
}