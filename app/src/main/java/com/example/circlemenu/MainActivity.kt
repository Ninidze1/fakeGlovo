package com.example.circlemenu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.MenuItem
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.example.circlemenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.circularMenu
            .setMainMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_logo_green_small, R.drawable.ic_baseline_clear_24)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_food)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_utils)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_alcohol)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_expressdel)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_parmasy)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_vardi)
            .setOnMenuSelectedListener{
                when(it) {
                    0 -> Toast.makeText(this, "გლოვო მალე მოგიტანთ საჭმელს", Toast.LENGTH_SHORT).show()
                    1 -> Toast.makeText(this, "გლოვო მალე მოგიტანთ ", Toast.LENGTH_SHORT).show()
                    2 -> Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
                    3 -> Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
                    4 -> Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
                    5 -> Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
                }
            }

        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        binding.circularMenu.startAnimation(animation)

    }

}


