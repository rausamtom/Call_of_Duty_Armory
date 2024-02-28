package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.databinding.FragmentMenuBinding
import android.content.Intent
import androidx.core.os.bundleOf
import com.application.callofdutyarmory.MwActivity
import com.application.callofdutyarmory.MwiiActivity

class MenuFragment : Fragment() {

    private var _binding : FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_menu, container, false)

        _binding = FragmentMenuBinding.inflate(inflater, container, false)

        val username = arguments?.getString("USERNAME")

        binding.btnSignOut.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_startFragment)
        }
        binding.btnAccount.setOnClickListener {
            val bundle = bundleOf("USERNAME" to username)
            findNavController().navigate(R.id.action_menuFragment_to_accountFragment, bundle)
        }
        binding.imgbtnMw.setOnClickListener {
            startActivity(Intent(activity, MwActivity::class.java))
        }
        binding.imgbtnMwii.setOnClickListener {
            startActivity(Intent(activity, MwiiActivity::class.java))
        }
        binding.btnAbout.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_aboutFragment)
        }

        return binding.root
    }
}