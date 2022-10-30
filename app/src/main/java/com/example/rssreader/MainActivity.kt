package com.example.rssreader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        // helper method to swap the FrameLayout with the fragment
        replaceFragment(RssListFragment())

        // Swapping fragments when clicking button nav view
        val fragmentManager: FragmentManager = supportFragmentManager

        // define your fragments here
        val rssFragment: Fragment = RssListFragment()
        //val categoriesFragment: Fragment = CategoriesFragment()
        //val settingsFragment: Fragment = SettingsFragment()

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // handle navigation selection
        bottomNavigationView.setOnItemSelectedListener { item ->
            lateinit var fragment: Fragment
            when (item.itemId) {
                R.id.rss_nav -> fragment = rssFragment
                //R.id.categories_nav -> fragment = categoriesFragment
                //R.id.settings_nav -> fragment = settingsFragment
            }
            fragmentManager.beginTransaction().replace(R.id.rss_frame_layout, fragment).commit()
            true
        }

        // Set default selection
        bottomNavigationView.selectedItemId = R.id.rss_nav
    }

    private fun replaceFragment(rssListFragment: RssListFragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.rss_frame_layout, rssListFragment)
        fragmentTransaction.commit()
    }

}