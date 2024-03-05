package com.application.callofdutyarmory.adapters

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.Toast
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.weapons.MwWeapon
import com.application.callofdutyarmory.weapons.MwWeaponProvider

class MwWeaponAdapter (
    private val weaponList: List<MwWeapon>,
    private val onClickListener: (MwWeapon) -> Unit
) : RecyclerView.Adapter<MwWeaponViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MwWeaponViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MwWeaponViewHolder(layoutInflater.inflate(R.layout.mw_weapon, parent, false))
    }

    override fun onBindViewHolder(holder: MwWeaponViewHolder, position: Int) {
        //holder.render(weaponList[position], onClickListener)

        val weaponItem = weaponList[position]
        holder.render(weaponItem, onClickListener)

        holder.binding.cbAddtofav.isChecked = weaponItem.isFavorite
        holder.binding.cbAddtofav.setOnCheckedChangeListener { _, isChecked ->
            val weapon = weaponList.find { it == weaponItem }
            weapon?.isFavorite = isChecked
            if (isChecked) {
                MwWeaponProvider.favWeaponList.add(weapon!!)
                Toast.makeText(holder.itemView.context, "${weaponItem.weapon} added to Favorites", Toast.LENGTH_SHORT).show()
            } else {
                MwWeaponProvider.favWeaponList.remove(weapon!!)
                Toast.makeText(holder.itemView.context, "${weaponItem.weapon} removed from Favorites", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return weaponList.size
    }
}