package itschool.uz

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter


class JanrPageAdapter(fa: FragmentActivity, val list: MutableList<String>) : FragmentStateAdapter(fa) {

    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
        return ProductItemFragment.newInstance(list[position])
    }
}