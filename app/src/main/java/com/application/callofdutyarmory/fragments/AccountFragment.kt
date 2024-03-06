package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.datastore.dataStore
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.lifecycle.lifecycleScope
import com.application.callofdutyarmory.data.UserProfile
import com.application.callofdutyarmory.dataStore
import com.application.callofdutyarmory.databinding.FragmentAccountBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AccountFragment : Fragment() {

    private var _binding : FragmentAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_account, container, false)

        _binding = FragmentAccountBinding.inflate(inflater, container, false)

        val username = binding.tvUsername

        lifecycleScope.launch(Dispatchers.IO) {
            getUserInfo()?.collect {
                withContext(Dispatchers.Main) {
                    username.text = it.username
                }
            }
        }

        return binding.root
    }

    private fun getUserInfo() = context?.dataStore?.data?.map { preferences ->
        UserProfile(
            username = preferences[stringPreferencesKey("username")].orEmpty(),
            showAbout = preferences[booleanPreferencesKey("showAbout")] ?: true
        )
    }
}