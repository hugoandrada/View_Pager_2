package com.hugo.andrada.dev.view_pager_2.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.hugo.andrada.dev.view_pager_2.R
import com.hugo.andrada.dev.view_pager_2.databinding.FragmentViewPagerBinding
import com.hugo.andrada.dev.view_pager_2.screens.onboarding.FirstScreenFragment
import com.hugo.andrada.dev.view_pager_2.screens.onboarding.SecondScreenFragment
import com.hugo.andrada.dev.view_pager_2.screens.onboarding.ThirdScreenFragment

class ViewPagerFragment : Fragment(R.layout.fragment_view_pager) {

    private var _binding: FragmentViewPagerBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentViewPagerBinding.bind(view)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreenFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter
    }
}