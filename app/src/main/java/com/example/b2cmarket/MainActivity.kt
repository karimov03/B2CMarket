package com.example.b2cmarket

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.b2cmarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnHome.setOnClickListener{
            binding.btnHome.setBackgroundColor(Color.parseColor("#69A6F9"))
            binding.btnLike.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnShop.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnUser.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        binding.btnLike.setOnClickListener{
            binding.btnHome.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnLike.setBackgroundColor(Color.parseColor("#69A6F9"))
            binding.btnShop.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnUser.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        binding.btnShop.setOnClickListener{
            binding.btnHome.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnLike.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnShop.setBackgroundColor(Color.parseColor("#69A6F9"))
            binding.btnUser.setBackgroundColor(Color.parseColor("#FFFFFF"))
        }
        binding.btnUser.setOnClickListener{
            binding.btnHome.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnLike.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnShop.setBackgroundColor(Color.parseColor("#FFFFFF"))
            binding.btnUser.setBackgroundColor(Color.parseColor("#69A6F9"))
        }

    }
}