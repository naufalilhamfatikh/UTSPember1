package com.example.uts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.frame_container, frag0())
            .addToBackStack(null)
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.navigation_list -> {
                // Ganti fragment ke fragment_home
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_container, frag0())
                    .addToBackStack(null)
                    .commit()
                return true
            }
            R.id.navigation_grid -> {
                // Ganti fragment ke fragment_profile
                supportFragmentManager.beginTransaction()
                    .replace(R.id.frame_container, frag2())
                    .addToBackStack(null)
                    .commit()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun sentToast(message: String){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()
    }
}

//    private val mOnNavigationItemSelectedListener =
//        NavigationView.OnNavigationItemSelectedListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.navigation_home -> {
//                    // Ganti fragment ke fragment_home
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.frame_container, frag2())
//                        .commit()
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.navigation_profile -> {
//                    // Ganti fragment ke fragment_profile
//                    supportFragmentManager.beginTransaction()
//                        .replace(R.id.frame_container, frag0())
//                        .commit()
//                    return@OnNavigationItemSelectedListener true
//                }
//            }
//            false
//        }
//
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        menuInflater.inflate(R.menu.main_menu, menu)
//        return true
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val navigationView = findViewById<NavigationView>(R.id.nvView)
//        navigationView.setNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
//
//        // Tampilkan fragment_home saat pertama kali dibuka
//        supportFragmentManager.beginTransaction()
//            .replace(R.id.frame_container, frag0())
//            .commit()
//    }
//}

//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.MenuItem
//import androidx.fragment.app.Fragment
//import com.example.uts.R
//import com.example.uts.frag0
//import com.example.uts.frag2
//import com.google.android.material.navigation.NavigationView
//
//class MainActivity : AppCompatActivity() {
//
//    // Deklarasi fragment yang akan ditampilkan
//    private val fragmentHome: Fragment = frag0()
//    private val fragmentProfile: Fragment = frag2()
//
//    // Deklarasi awal fragment yang akan ditampilkan
//    private var activeFragment: Fragment = fragmentHome
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Inisialisasi Bottom Navigation View
//        val NavigationView = findViewById<NavigationView>(R.id.nvView)
//
//        // Set listener pada menu navigasi
//        NavigationView.setNavigationItemSelectedListener { menuItem ->
//            when (menuItem.itemId) {
//                R.id.navigation_home -> {
//                    switchFragment(fragmentHome)
//                    return@setNavigationItemSelectedListener true
//                }
//                R.id.navigation_profile -> {
//                    switchFragment(fragmentProfile)
//                    return@setNavigationItemSelectedListener true
//                }
//            }
//            false
//        }
//
//        // Tampilkan fragment awal saat activity pertama kali dibuka
//        supportFragmentManager.beginTransaction().add(R.id.frame_container, fragmentProfile, "2").hide(fragmentProfile).commit()
//        supportFragmentManager.beginTransaction().add(R.id.frame_container,fragmentHome, "1").commit()
//    }
//
//    // Method untuk berpindah ke fragment lain
//    private fun switchFragment(fragment: Fragment) {
//        supportFragmentManager.beginTransaction().hide(activeFragment).show(fragment).commit()
//        activeFragment = fragment
//    }
//}

