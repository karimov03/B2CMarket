package com.example.b2cmarket

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.b2cmarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private var doubleBackToExitPressedOnce = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val navController = findNavController(R.id.my_navigation_host)

        binding.btnHome.setOnClickListener {
            if (navController.currentDestination?.id != R.id.homeFragment) {
                setButtonColors(binding.btnHome)
                navController.popBackStack()
            }
        }

        binding.btnLike.setOnClickListener {
            if (navController.currentDestination?.id != R.id.likeFragment) {
                setButtonColors(binding.btnLike)
                navController.popBackStack()
                navController.navigate(R.id.likeFragment)
            }
        }

        binding.btnShop.setOnClickListener {
            if (navController.currentDestination?.id != R.id.shopFragment) {
                setButtonColors(binding.btnShop)
                navController.popBackStack()
                navController.navigate(R.id.shopFragment)
            }
        }

        binding.btnUser.setOnClickListener {
            if (navController.currentDestination?.id != R.id.userFragment) {
                setButtonColors(binding.btnUser)
                navController.popBackStack()
                navController.navigate(R.id.userFragment)
            }
        }

        binding.btnSell.setOnClickListener {
            Toast.makeText(this, "Sabr", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setButtonColors(selectedButton: View) {
        val buttons = listOf(
            binding.btnHome,
            binding.btnLike,
            binding.btnShop,
            binding.btnUser
        )

        buttons.forEach { button ->
            button.setBackgroundColor(
                if (button == selectedButton) Color.parseColor("#69A6F9")
                else Color.parseColor("#FFFFFF")
            )
        }
    }

    override fun onBackPressed() {

        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        }

        this.doubleBackToExitPressedOnce = true
        Toast.makeText(this, "Iltimos, chiqish uchun yana bir marta bosing", Toast.LENGTH_SHORT).show()

        Handler().postDelayed({
            doubleBackToExitPressedOnce = false
        }, 2000)
    }
}
