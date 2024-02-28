package com.application.callofdutyarmory.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.application.callofdutyarmory.fragments.About1Fragment
import com.application.callofdutyarmory.fragments.About2Fragment
import java.lang.IllegalArgumentException

class ViewPagerAdapter (fa:FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> About1Fragment()
            1 -> About2Fragment()
            else -> throw IllegalArgumentException("Posición no válida $position")
        }
    }
}