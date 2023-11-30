package com.example.b2cmarket.RegisterFragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.b2cmarket.MainActivity
import com.example.b2cmarket.R
import com.example.b2cmarket.databinding.FragmentUserNameBinding


class UserNameFragment : Fragment() {
    private val binding by lazy { FragmentUserNameBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bundle = Bundle()
        val phoneNumber=bundle.getString("phoneNumber","null")
        binding.thisPhone.text="Foydalanuvchiga biriktirilgan\\ntelefon raqam: $phoneNumber"
        binding.btnNext.setOnClickListener {
            val sharedPreferences:SharedPreferences=requireContext().getSharedPreferences("my_cashe",Context.MODE_PRIVATE)
            sharedPreferences.edit().putBoolean("user",true).apply()
            val intent = Intent(requireContext(),MainActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}
