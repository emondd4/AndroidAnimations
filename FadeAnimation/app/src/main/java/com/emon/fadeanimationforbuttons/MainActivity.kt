package com.emon.fadeanimationforbuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {

    private lateinit var layout: LinearLayout
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var fade: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.selectedLinearLayout)
        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)

        btn1.alpha = 0.0F
        btn2.alpha = 0.0F

        fade = AnimationUtils.loadAnimation(this,R.anim.fade_anim)

        layout.setOnClickListener {
            layout.background = AppCompatResources.getDrawable(this,R.drawable.item_selected_background)
            btn1.alpha = 1.0F
            btn2.alpha = 1.0F
            btn1.startAnimation(fade)
            btn2.startAnimation(fade)
        }

        btn2.setOnClickListener {
            layout.background = AppCompatResources.getDrawable(this,R.drawable.item_background)
            btn1.alpha = 0.0F
            btn2.alpha = 0.0F
        }

    }
}