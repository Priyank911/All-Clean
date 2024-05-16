package com.example.allclean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.allclean.databinding.ActivitySignInBinding

class Sign_inActivity : AppCompatActivity() {
    private val binding:ActivitySignInBinding by lazy {
        ActivitySignInBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.alreadyaccount.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.signupbutton.setOnClickListener {
            val intent = Intent(this, chooselocationActivity::class.java)
            startActivity(intent)
        }
    }
}