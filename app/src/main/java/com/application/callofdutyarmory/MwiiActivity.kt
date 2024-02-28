package com.application.callofdutyarmory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.application.callofdutyarmory.databinding.ActivityMwiiBinding
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MwiiActivity : AppCompatActivity() {

    private var _binding : ActivityMwiiBinding? = null
    private val binding get() = _binding!!

    private val navController by lazy {
        (supportFragmentManager.findFragmentById(R.id.fcvMwii) as NavHostFragment).navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_mwii)

        _binding = ActivityMwiiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mwiiBottomnav.setupWithNavController(navController)
    }
}