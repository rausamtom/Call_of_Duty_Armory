package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.application.callofdutyarmory.adapters.MwWeaponAdapter
import com.application.callofdutyarmory.databinding.FragmentFavmwweaponsBinding
import com.application.callofdutyarmory.weapons.MwWeapon
import com.application.callofdutyarmory.weapons.MwWeaponProvider

class FavmwweaponsFragment : Fragment() {

    private var _binding : FragmentFavmwweaponsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_favmwweapons, container, false)

        _binding = FragmentFavmwweaponsBinding.inflate(inflater, container, false)

        initializeRecyclerView()

        return binding.root
    }

    private fun initializeRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.rvMwfavs.layoutManager = manager
        binding.rvMwfavs.adapter = MwWeaponAdapter(MwWeaponProvider.favWeaponList) { mwWeapon -> onItemSelected(mwWeapon) }
    }

    private fun onItemSelected(weapon: MwWeapon) {
    }
}