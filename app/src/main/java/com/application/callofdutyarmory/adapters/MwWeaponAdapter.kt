package com.application.callofdutyarmory.adapters

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.weapons.MwWeapon

class MwWeaponAdapter (private val weaponList: List<MwWeapon>, private val onClickListener: (MwWeapon) -> Unit) : RecyclerView.Adapter<MwWeaponViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MwWeaponViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MwWeaponViewHolder(layoutInflater.inflate(R.layout.mw_weapon, parent, false))
    }

    override fun onBindViewHolder(holder: MwWeaponViewHolder, position: Int) {
        holder.render(weaponList[position], onClickListener)
    }

    override fun getItemCount(): Int {
        return weaponList.size
    }
}
