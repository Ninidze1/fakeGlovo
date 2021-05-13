package com.example.circlemenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.circlemenu.R
import com.example.circlemenu.databinding.ActivityMainBinding
import com.example.circlemenu.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

private lateinit var binding: ActivitySplashBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.glovoIcon.alpha = 0f
        binding.glovoIcon.animate().setDuration(2000).alpha(1f).withEndAction {

            startActivity(Intent(this, MainActivity::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}