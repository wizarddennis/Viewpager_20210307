package kr.co.tjoeun.viewpager_20210307.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kr.co.tjoeun.viewpager_20210307.fragments.BirthFragment
import kr.co.tjoeun.viewpager_20210307.fragments.DescFragment
import kr.co.tjoeun.viewpager_20210307.fragments.NickFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "닉네임"
            1 -> "생년월일"
            else -> "소개문구"
        }
    }
    override fun getCount(): Int {
        return 3

    }

    override fun getItem(position: Int): Fragment {
/*
 아래 return 문과 동일한 표현
        if (position == 0) {
            return NickFragment()
        }
        else if (position == 1) {
            return BirthFragment()
        }
        else {
            return DescFragment()
        }
*/        
        return when(position) {
            0 -> NickFragment()
            1 -> BirthFragment()
            else -> DescFragment()            
        }
    }
}