package com.example.classwork21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val messageFragment = FragmentClass()

        supportFragmentManager
            .beginTransaction()
            .add(R.id.thisFrameLayout,messageFragment)
            .commit()
    }
}