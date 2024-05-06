package com.example.newsalter.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.newsalter.R
import com.example.newsalter.databinding.ActivitySplashScreenBinding

class WelcomeScreen : AppCompatActivity() {
    lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.welcomeButton.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
            finishAffinity()
            makeToast("Moved ... 💞💞")


        }
    }

    private fun makeToast(message:String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}