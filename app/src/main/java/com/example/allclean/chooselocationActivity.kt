package com.example.allclean

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.allclean.databinding.ActivityChooselocationBinding

class chooselocationActivity : AppCompatActivity() {
    private val binding:ActivityChooselocationBinding by lazy {
        ActivityChooselocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationList: Array<String> = arrayOf("Vadodara", "Surat", "Ahmedabad", "Rajkot", "Gandhinagar", "Jamnagar", "Bhavnagar")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView: AutoCompleteTextView = binding.listofchoose
        autoCompleteTextView.setAdapter(adapter)

        binding.passmain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}