package com.omidrezabagherian.androidtutorial

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omidrezabagherian.androidtutorial.databinding.FragmentDashboardBinding

class DashboardFragment:Fragment(R.layout.fragment_dashboard) {
    private lateinit var dashboardBinding: FragmentDashboardBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dashboardBinding = FragmentDashboardBinding.bind(view)
    }
}