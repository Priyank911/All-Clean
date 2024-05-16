package com.example.allclean

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import com.example.allclean.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.donthaveaccount.setOnClickListener {
            val intent = Intent(this, Sign_inActivity::class.java)
            startActivity(intent)
        }
    }
}