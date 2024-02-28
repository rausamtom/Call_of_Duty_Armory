package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.databinding.FragmentAbout1Binding

class About1Fragment : Fragment() {

    private var _binding : FragmentAbout1Binding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_about1, container, false)

        _binding = FragmentAbout1Binding.inflate(inflater, container, false)

        return binding.root
    }
}