package com.emon.sharedactivityanimation

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.util.Pair
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var cart: CardView
    private lateinit var image: ImageView
    private lateinit var name: TextView
    private lateinit var desc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cart = findViewById(R.id.mainCart)
        image = findViewById(R.id.mainImage)
        name = findViewById(R.id.mainName)
        desc = findViewById(R.id.mainDesc)

        cart.setOnClickListener{

            val intent = Intent(MainActivity@this,SharedActivity::class.java)

            val options: ActivityOptions = ActivityOptions.makeSceneTransitionAnimation(
                this,
                Pair.create(image, "mainImage"),
                Pair.create(name, "mainName"),
                Pair.create(desc, "mainDesc")
            )

            startActivity(intent, options.toBundle())

        }

    }
}