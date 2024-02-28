package com.application.callofdutyarmory.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.application.callofdutyarmory.databinding.MwWeaponBinding
import com.application.callofdutyarmory.weapons.MwWeapon

private const val DRAWABLE = "drawable"

class MwWeaponViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    private val binding = MwWeaponBinding.bind(view)

    fun render(weaponModel: MwWeapon, onClickListener: (MwWeapon) -> Unit) {
        val context = binding.ivWeapon.context
        val idPreview = context.resources.getIdentifier(weaponModel.preview, DRAWABLE, context.packageName)
        binding.ivWeapon.setImageResource(idPreview)
        binding.tvWeapon.text = weaponModel.weapon
        binding.tvCategory.text = weaponModel.category
        binding.tvCaliber.text = weaponModel.caliber

        itemView.setOnClickListener { onClickListener(weaponModel) }
    }
}