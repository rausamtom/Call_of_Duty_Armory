package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.databinding.FragmentSigninBinding
import android.widget.Toast
import androidx.core.os.bundleOf

class SigninFragment : Fragment() {

    private var _binding : FragmentSigninBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_signin, container, false)

        _binding = FragmentSigninBinding.inflate(inflater, container, false)

        binding.btnSignIn.setOnClickListener {
            val username = binding.etUsername.text.toString()

            if (username.isNotEmpty()) {
                val bundle = bundleOf("USERNAME" to username)
                findNavController().navigate(R.id.action_signinFragment_to_menuFragment, bundle)
            }
            else {
                Toast.makeText(requireContext(), "Username is empty", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}