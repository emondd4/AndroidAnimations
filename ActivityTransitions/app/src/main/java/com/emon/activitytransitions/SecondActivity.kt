package com.emon.activitytransitions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn = findViewById(R.id.secondButton)

        btn.setOnClickListener {

            startActivity(Intent(this@SecondActivity, MainActivity::class.java))

            //overridePendingTransition(R.anim.slide_out_left, R.anim.slide_in_right)
            //overridePendingTransition(R.anim.slide_out_bottom, R.anim.slide_in_bottom)
            overridePendingTransition(R.anim.slide_fade_out, R.anim.slide_fade_in)
        }

    }
}