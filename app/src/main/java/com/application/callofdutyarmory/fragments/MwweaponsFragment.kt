package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.databinding.FragmentMwweaponsBinding
import com.application.callofdutyarmory.weapons.MwWeaponProvider
import com.application.callofdutyarmory.adapters.MwWeaponAdapter
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.application.callofdutyarmory.weapons.MwWeapon

class MwweaponsFragment : Fragment() {

    private var _binding : FragmentMwweaponsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_mwweapons, container, false)

        _binding = FragmentMwweaponsBinding.inflate(inflater, container, false)

        initializeRecyclerView()

        return binding.root
    }

    private fun initializeRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.rvMw.layoutManager = manager
        binding.rvMw.adapter = MwWeaponAdapter(MwWeaponProvider.weaponList) { mwWeapon -> onItemSelected(mwWeapon) }
    }

    private fun onItemSelected(weapon: MwWeapon) {
        val weaponId = weapon.preview
        val bundle = bundleOf("ID" to weaponId)
        findNavController().navigate(R.id.action_mwweaponsFragment_to_mwweaponDetailsFragment, bundle)
    }
}