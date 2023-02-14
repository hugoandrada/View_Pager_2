package com.hugo.andrada.dev.view_pager_2.screens.splash_screen

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.hugo.andrada.dev.view_pager_2.R
import com.hugo.andrada.dev.view_pager_2.databinding.FragmentSplashBinding

class SplashFragment : Fragment(R.layout.fragment_splash) {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentSplashBinding.bind(view)

        setupSplash()
    }

    private fun setupSplash() {
        Handler().postDelayed({
            if (onBoardFinish()) {
                findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
            } else {
                findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
            }
        }, 3000)
    }

    private fun onBoardFinish(): Boolean {
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        return sharedPref.getBoolean("finish", false)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}