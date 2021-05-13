package com.example.circlemenu

import android.app.ProgressDialog.show
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
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



        val fastFoodUrl = "https://glovoapp.com/ge/ka/tbilisi/top-brendebi_590/"
        val groceriesUrl = "https://glovoapp.com/ge/ka/tbilisi/supermarketi_540/"
        val alcoholUrl = "https://glovoapp.com/ge/ka/tbilisi/alkoholi_252/"
        val gitUrl = "https://github.com/Ninidze1"
        val pharmacyUrl = "https://glovoapp.com/ge/ka/tbilisi/aphtiaqi_760/"
        val holyShaurmaUrl = "https://glovoapp.com/ge/ka/tbilisi/restornebi_1/shaurma_34962/"

        val site = Intent(Intent.ACTION_VIEW)
        site.data = Uri.parse(fastFoodUrl)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
        binding.circularMenu.startAnimation(animation)

        binding.circularMenu
            .setMainMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_logo_green_small, R.drawable.ic_baseline_clear_24)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_fast_food)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_groceries)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_liquor)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_github)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_medicine)
            .addSubMenu(Color.parseColor("#FFFFFF"), R.drawable.ic_shawarma)
            .setOnMenuSelectedListener{

                when(it) {
                    0 -> {
                        site.data = Uri.parse(fastFoodUrl)
                        Handler().postDelayed({
                            startActivity(site)
                        }, 1000)

                    }
                    1 -> {
                        site.data = Uri.parse(groceriesUrl)
                        Handler().postDelayed({
                            startActivity(site)
                        }, 1000)
                    }
                    2 -> {
                        site.data = Uri.parse(alcoholUrl)
                        Handler().postDelayed({
                            startActivity(site)
                        }, 1000)
                    }
                    3 -> {
                        site.data = Uri.parse(gitUrl)
                        Handler().postDelayed({
                            startActivity(site)
                        }, 1000)
                    }
                    4 -> {
                        site.data = Uri.parse(pharmacyUrl)
                        Handler().postDelayed({
                            startActivity(site)
                        }, 1000)
                    }
                    5 -> {
                        site.data = Uri.parse(holyShaurmaUrl)
                        Handler().postDelayed({
                            startActivity(site)
                        }, 1000)
                    }

                }

            }

    }

}


