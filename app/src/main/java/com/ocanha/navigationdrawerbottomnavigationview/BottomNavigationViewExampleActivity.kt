package com.ocanha.navigationdrawerbottomnavigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.ocanha.navigationdrawerbottomnavigationview.databinding.ActivityBottomNavigationViewExampleBinding

class BottomNavigationViewExampleActivity : AppCompatActivity() {

    private lateinit var _binding : ActivityBottomNavigationViewExampleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityBottomNavigationViewExampleBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val navHostFragment =
            (supportFragmentManager.findFragmentById(_binding.fragmentContainerView.id) as NavHostFragment)

        val navController = navHostFragment.navController
        _binding.bottonNavigationView.setupWithNavController(navController)

    }
}