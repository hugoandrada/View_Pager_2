package com.hugo.andrada.dev.view_pager_2.screens.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.hugo.andrada.dev.view_pager_2.R
import com.hugo.andrada.dev.view_pager_2.databinding.FragmentSeconScreenBinding

class SecondScreenFragment : Fragment(R.layout.fragment_secon_screen) {

    private var _binding: FragmentSeconScreenBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentSeconScreenBinding.bind(view)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.secondPage.setOnClickListener {
            viewPager?.currentItem = 2
        }
    }
}