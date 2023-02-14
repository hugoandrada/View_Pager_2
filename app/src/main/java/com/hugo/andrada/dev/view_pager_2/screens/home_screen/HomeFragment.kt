package com.hugo.andrada.dev.view_pager_2.screens.home_screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.hugo.andrada.dev.view_pager_2.R
import com.hugo.andrada.dev.view_pager_2.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentHomeBinding.bind(view)
    }
}