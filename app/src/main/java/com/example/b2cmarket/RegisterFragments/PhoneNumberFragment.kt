package com.example.b2cmarket.RegisterFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.b2cmarket.R
import com.example.b2cmarket.databinding.FragmentPhoneNumberBinding


class PhoneNumberFragment : Fragment() {
    private val binding by lazy { FragmentPhoneNumberBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val navController = findNavController().navigate(R.id.my_navigation_host)




        return binding.root

    }
}