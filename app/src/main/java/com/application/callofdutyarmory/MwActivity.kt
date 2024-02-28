package com.application.callofdutyarmory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.application.callofdutyarmory.databinding.ActivityMwBinding
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MwActivity : AppCompatActivity() {

    private var _binding : ActivityMwBinding? = null
    private val binding get() = _binding!!

    private val navController by lazy {
        (supportFragmentManager.findFragmentById(R.id.fcvMw) as NavHostFragment).navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_mw)

        _binding = ActivityMwBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mwBottomnav.setupWithNavController(navController)
    }
}