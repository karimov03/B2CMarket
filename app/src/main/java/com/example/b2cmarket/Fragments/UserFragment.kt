package com.example.b2cmarket.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.b2cmarket.R
import com.example.b2cmarket.databinding.FragmentUserBinding

class UserFragment : Fragment() {
    private val binding by lazy { FragmentUserBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return binding.root
    }
}