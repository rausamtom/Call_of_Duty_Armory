package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private var _binding : FragmentStartBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_login, container, false)

        _binding = FragmentStartBinding.inflate(inflater, container, false)

        binding.btnSignIn.setOnClickListener {
            findNavController().navigate(R.id.action_startFragment_to_signinFragment)
        }

        return binding.root
    }
}