package com.example.zeroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var button_creator : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val menuBottom:BottomNavigationView = findViewById(R.id.navigation)
        menuBottom.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home -> openFragment(HomeFragment())
                R.id.list -> openFragment(ListFragment())
                R.id.contact -> openFragment(ContactFragment())
                R.id.calendar -> openFragment(CalendarFragment())
            }
            true
        }
    }
    fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment, fragment).commit()
    }
}