package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.adapters.ViewPagerAdapter
import com.application.callofdutyarmory.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private var _binding : FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_about, container, false)

        _binding = FragmentAboutBinding.inflate(inflater, container, false)

        val adapter = ViewPagerAdapter(requireActivity())
        binding.aboutvp.adapter = adapter

        return binding.root
    }
}