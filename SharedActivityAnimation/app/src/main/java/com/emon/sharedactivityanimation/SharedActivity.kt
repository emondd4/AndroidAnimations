package com.emon.sharedactivityanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class SharedActivity : AppCompatActivity() {

    private lateinit var cart: CardView
    private lateinit var image: ImageView
    private lateinit var name: TextView
    private lateinit var desc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared)

        cart = findViewById(R.id.sharedCart)
        image = findViewById(R.id.sharedImage)
        name = findViewById(R.id.sharedName)
        desc = findViewById(R.id.sharedDesc)
    }
}