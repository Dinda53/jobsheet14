package com.example.jobsheet14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BUSANA = findViewById<Button>(R.id.Blue)
        val KULINER = findViewById<Button>(R.id.Green)
        val PPLG = findViewById<Button>(R.id.yellow2)
        val TPFL = findViewById<Button>(R.id.Red)
        val TO = findViewById<Button>(R.id.Purple)


        BUSANA.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BlueFragment())
            fragmentTransaction.commit()
        }

        KULINER.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, GreenFragment())
            fragmentTransaction.commit()
        }

        PPLG.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, YellowFragment())
            fragmentTransaction.commit()
        }

        TPFL.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, RedFragment())
            fragmentTransaction.commit()
        }

        TO.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, PurpleFragment())
            fragmentTransaction.commit()
        }
    }
}