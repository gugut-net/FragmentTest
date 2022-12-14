package com.example.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttest.view.FirstFragment
import com.example.fragmenttest.view.SecondFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_one, FirstFragment())
            .addToBackStack(null)
            .commit()
        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container_two, SecondFragment())
            .addToBackStack(null)
            .commit()
    }
}