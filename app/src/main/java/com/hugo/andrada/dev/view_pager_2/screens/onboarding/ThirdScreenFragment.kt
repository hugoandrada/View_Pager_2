package com.hugo.andrada.dev.view_pager_2.screens.onboarding

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.hugo.andrada.dev.view_pager_2.R
import com.hugo.andrada.dev.view_pager_2.databinding.FragmentThirdScreenBinding

class ThirdScreenFragment : Fragment(R.layout.fragment_third_screen) {

    private var _binding: FragmentThirdScreenBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentThirdScreenBinding.bind(view)

        binding.thirdPage.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
            onBoardFinish()
        }
    }

    private fun onBoardFinish() {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("finish", true)
        editor.apply()
    }
}