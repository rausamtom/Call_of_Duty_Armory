package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.adapters.MwiiWeaponAdapter
import com.application.callofdutyarmory.databinding.FragmentFavmwiiweaponsBinding
import com.application.callofdutyarmory.weapons.MwiiWeapon
import com.application.callofdutyarmory.weapons.MwiiWeaponProvider

class FavmwiiweaponsFragment : Fragment() {

    private var _binding : FragmentFavmwiiweaponsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_favmwweapons, container, false)

        _binding = FragmentFavmwiiweaponsBinding.inflate(inflater, container, false)

        initializeRecyclerView()

        return binding.root
    }

    private fun initializeRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.rvMwiifavs.layoutManager = manager
        binding.rvMwiifavs.adapter = MwiiWeaponAdapter(MwiiWeaponProvider.favWeaponList) { mwiiWeapon -> onItemSelected(mwiiWeapon) }
    }

    private fun onItemSelected(weapon: MwiiWeapon) {
    }
}