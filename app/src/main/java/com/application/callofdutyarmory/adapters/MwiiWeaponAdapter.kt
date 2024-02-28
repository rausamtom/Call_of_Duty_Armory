package com.application.callofdutyarmory.adapters

import com.application.callofdutyarmory.weapons.MwiiWeapon
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.application.callofdutyarmory.R

class MwiiWeaponAdapter (private val weaponList: List<MwiiWeapon>, private val onClickListener: (MwiiWeapon) -> Unit) :RecyclerView.Adapter<MwiiWeaponViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MwiiWeaponViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MwiiWeaponViewHolder(layoutInflater.inflate(R.layout.mwii_weapon, parent, false))
    }

    override fun onBindViewHolder(holder: MwiiWeaponViewHolder, position: Int) {
        holder.render(weaponList[position], onClickListener)
    }

    override fun getItemCount(): Int {
        return weaponList.size
    }
}