package com.example.a3l6hw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3l6hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var count = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.button.text == "+1" && count<11)
                count++
                binding.tvNumber.text = count.toString()
            if(binding.button.text == "+1" && count>10)
                binding.button.text = "-1"
            if(binding.button.text == "-1" && count>0)
                count--
            binding.tvNumber.text = count.toString()
            if(binding.button.text == "-1" && count==0)
            startActivity(Intent(this, SecondActivity::class.java))

        }
    }
}