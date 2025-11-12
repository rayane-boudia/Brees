package com.example.brees

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.brees.databinding.ActivityMainBinding
import com.example.brees.ui.frags.ChartFragment
import com.example.brees.ui.frags.GraphFragment
import com.example.brees.ui.frags.HomeFragment
import com.example.brees.ui.frags.ProfileFragment
import me.ibrahimsn.lib.SmoothBottomBar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Check if this is the first time the activity is created
        if (savedInstanceState == null) {
            // Manually load the HomeFragment as the default view
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment())
                .commit()
        }

        // Use binding to access views, not findViewById
        binding.bottomBar.onItemSelected = { index ->
            when (index) {
                0 -> supportFragmentManager.beginTransaction()
                    .replace(R.id.container, HomeFragment()).commit()

                1 -> supportFragmentManager.beginTransaction()
                    .replace(R.id.container, GraphFragment()).commit()

                2 -> supportFragmentManager.beginTransaction()
                    .replace(R.id.container, ChartFragment()).commit()

                3 -> supportFragmentManager.beginTransaction()
                    .replace(R.id.container, ProfileFragment()).commit()
            }
        }
    }
}