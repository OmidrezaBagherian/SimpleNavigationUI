package com.omidrezabagherian.androidtutorial

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.omidrezabagherian.androidtutorial.databinding.FragmentSettingBinding

class SettingFragment:Fragment(R.layout.fragment_setting) {
    private lateinit var settingBinding: FragmentSettingBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        settingBinding = FragmentSettingBinding.bind(view)
    }
}