package com.application.callofdutyarmory.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.application.callofdutyarmory.databinding.FragmentMwiiweaponDetailsBinding
import com.application.callofdutyarmory.weapons.MwiiWeaponProvider

class MwiiweaponDetailsFragment : Fragment() {

    private var _binding : FragmentMwiiweaponDetailsBinding? = null
    private val binding get() = _binding!!

    private val DRAWABLE = "drawable"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return inflater.inflate(R.layout.fragment_mwiiweapon_details, container, false)

        _binding = FragmentMwiiweaponDetailsBinding.inflate(inflater, container, false)

        val weaponId = arguments?.getString("ID")
        val weapon = MwiiWeaponProvider.weaponList.find { it.preview == weaponId }
        if (weapon != null) {
            val context = binding.ivWeapon.context
            val idPreview = context.resources.getIdentifier(weapon.preview, DRAWABLE, context.packageName)
            binding.ivWeapon.setImageResource(idPreview)
            binding.tvWeapon.text = weapon.weapon
            binding.tvPlatform.text = weapon.platform
            binding.tvCategory.text = weapon.category
            binding.tvCaliber.text = weapon.caliber
            binding.tvDescription.text = weapon.description
        }

        return binding.root
    }
}