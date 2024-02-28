package com.application.callofdutyarmory.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.application.callofdutyarmory.databinding.MwiiWeaponBinding
import com.application.callofdutyarmory.weapons.MwiiWeapon

private const val DRAWABLE = "drawable"

class MwiiWeaponViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    private val binding = MwiiWeaponBinding.bind(view)

    fun render(weaponModel: MwiiWeapon, onClickListener: (MwiiWeapon) -> Unit) {
        val context = binding.ivWeapon.context
        val idPreview = context.resources.getIdentifier(weaponModel.preview, DRAWABLE, context.packageName)
        binding.ivWeapon.setImageResource(idPreview)
        binding.tvWeapon.text = weaponModel.weapon
        binding.tvPlatform.text = weaponModel.platform
        binding.tvCategory.text = weaponModel.category
        binding.tvCaliber.text = weaponModel.caliber

        itemView.setOnClickListener { onClickListener(weaponModel) }
    }
}