package com.food.oder.ui.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerMainAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {

    private val listFrag = ArrayList<Fragment>()
    override fun getItemCount(): Int {
        return listFrag.size
    }

    override fun createFragment(position: Int): Fragment {
        return listFrag[position]
    }

    fun addFragment(fragment: Fragment?) {
        listFrag.add(fragment!!)
    }
}