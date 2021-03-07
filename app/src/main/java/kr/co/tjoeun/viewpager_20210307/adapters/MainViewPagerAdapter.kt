package kr.co.tjoeun.viewpager_20210307.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_20210307.fragments.BirthFragment
import kr.co.tjoeun.viewpager_20210307.fragments.DescFragment
import kr.co.tjoeun.viewpager_20210307.fragments.NickFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
        return 3

    }

    override fun getItem(position: Int): Fragment {
        if (position == 0) {
            return NickFragment()
        }
        else if (position == 1) {
            return BirthFragment()
        }
        else {
            return DescFragment()
        }
    }
}