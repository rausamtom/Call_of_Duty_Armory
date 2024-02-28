package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.databinding.FragmentFavmwiiweaponsBinding

class FavmwiiweaponsFragment : Fragment() {

    private var _binding : FragmentFavmwiiweaponsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_favmwweapons, container, false)

        _binding = FragmentFavmwiiweaponsBinding.inflate(inflater, container, false)

        return binding.root
    }
}