package com.omidrezabagherian.androidtutorial

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omidrezabagherian.androidtutorial.databinding.FragmentHomeBinding

class HomeFragment:Fragment(R.layout.fragment_home) {
    private lateinit var homeBinding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeBinding = FragmentHomeBinding.bind(view)
    }
}