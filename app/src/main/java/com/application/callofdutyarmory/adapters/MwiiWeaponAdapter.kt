package com.application.callofdutyarmory.adapters

import com.application.callofdutyarmory.weapons.MwiiWeapon
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.Toast
import com.application.callofdutyarmory.R
import com.application.callofdutyarmory.weapons.MwiiWeaponProvider

class MwiiWeaponAdapter (
    private val weaponList: List<MwiiWeapon>,
    private val onClickListener: (MwiiWeapon) -> Unit
) : RecyclerView.Adapter<MwiiWeaponViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MwiiWeaponViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MwiiWeaponViewHolder(layoutInflater.inflate(R.layout.mwii_weapon, parent, false))
    }

    override fun onBindViewHolder(holder: MwiiWeaponViewHolder, position: Int) {
        //holder.render(weaponList[position], onClickListener)

        val weaponItem = weaponList[position]
        holder.render(weaponItem, onClickListener)

        holder.binding.cbAddtofav.isChecked = weaponItem.isFavorite
        holder.binding.cbAddtofav.setOnCheckedChangeListener { _, isChecked ->
            val weapon = weaponList.findLast { it == weaponItem }
            weapon?.isFavorite = isChecked
            if (isChecked) {
                MwiiWeaponProvider.favWeaponList.add(weapon!!)
                Toast.makeText(holder.itemView.context, "${weaponItem.weapon} added to Favorites", Toast.LENGTH_SHORT).show()
            } else {
                MwiiWeaponProvider.favWeaponList.remove(weapon!!)
                Toast.makeText(holder.itemView.context, "${weaponItem.weapon} removed from Favorites", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun getItemCount(): Int {
        return weaponList.size
    }
}