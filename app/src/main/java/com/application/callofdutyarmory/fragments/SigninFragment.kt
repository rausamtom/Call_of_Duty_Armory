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
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.lifecycle.lifecycleScope
import com.application.callofdutyarmory.dataStore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SigninFragment : Fragment() {

    private var _binding : FragmentSigninBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_signin, container, false)

        _binding = FragmentSigninBinding.inflate(inflater, container, false)

        val username = binding.etUsername

        binding.btnSignIn.setOnClickListener {
            if (username.text.toString().isNotEmpty()) {
                lifecycleScope.launch(Dispatchers.IO) {
                    saveValues(username.text.toString(), true)
                }
                findNavController().navigate(R.id.action_signinFragment_to_aboutFragment)
            }
            else {
                Toast.makeText(requireContext(), "Username is empty", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    private suspend fun saveValues(username: String, showAbout: Boolean) {
        context?.dataStore?.edit { preferences ->
            preferences[stringPreferencesKey("username")] = username
            preferences[booleanPreferencesKey("showAbout")] = showAbout
        }
    }
}