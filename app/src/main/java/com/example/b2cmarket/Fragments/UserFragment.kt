package com.example.b2cmarket.Fragments

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.b2cmarket.RegisterActivity
import com.example.b2cmarket.databinding.FragmentUserBinding

class UserFragment : Fragment() {
    private val binding by lazy { FragmentUserBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val sharedPreferences: SharedPreferences =requireContext().getSharedPreferences("my_cashe",
            Context.MODE_PRIVATE)

        val user=sharedPreferences.getBoolean("user",false)
        if (user){
            binding.viewAfter.visibility=View.VISIBLE
            binding.viewBefore.visibility=View.GONE
        }
        binding.btnRegister.setOnClickListener {
            val intent = Intent(requireContext(), RegisterActivity::class.java)
            startActivity(intent)
        }
        return binding.root
    }
}