package com.emon.activitytransitions


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.firstButton)

        btn.setOnClickListener {

            startActivity(Intent(this@MainActivity, SecondActivity::class.java))

            //overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
            //overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_bottom)
            overridePendingTransition(R.anim.slide_fade_in, R.anim.slide_fade_out)

        }

    }
}