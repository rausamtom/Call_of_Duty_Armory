package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.databinding.FragmentMwiiweaponsBinding
import com.application.callofdutyarmory.weapons.MwiiWeaponProvider
import com.application.callofdutyarmory.adapters.MwiiWeaponAdapter
import com.application.callofdutyarmory.weapons.MwiiWeapon

class MwiiweaponsFragment : Fragment() {

    private var _binding : FragmentMwiiweaponsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_mwiiweapons, container, false)

        _binding = FragmentMwiiweaponsBinding.inflate(inflater, container, false)

        initializeRecyclerView()

        return binding.root
    }

    fun initializeRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        binding.rvMwii.layoutManager = manager
        binding.rvMwii.adapter = MwiiWeaponAdapter(MwiiWeaponProvider.weaponList) { mwiiWeapon -> onItemSelected(mwiiWeapon) }
    }

    fun onItemSelected(weapon: MwiiWeapon) {
        val weaponId = weapon.preview
        val bundle = bundleOf("ID" to weaponId)
        findNavController().navigate(R.id.action_mwiiweaponsFragment_to_mwiiweaponDetailsFragment, bundle)
    }
}