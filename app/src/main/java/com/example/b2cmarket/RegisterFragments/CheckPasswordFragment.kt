package com.example.b2cmarket.RegisterFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.b2cmarket.R
import com.example.b2cmarket.databinding.FragmentCheckPasswordBinding
import com.google.firebase.appcheck.FirebaseAppCheckKtxRegistrar


class CheckPasswordFragment : Fragment() {
    private val binding by lazy { FragmentCheckPasswordBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val bundle=Bundle()
        val phoneNumber=bundle.getString("phoneNumber","null")

        binding.thisPhone.text="Kod yuborilgan raqam: $phoneNumber"
        binding.btnNext.setOnClickListener {
            bundle.putString("phoneNumber",phoneNumber)
            findNavController().navigate(R.id.userNameFragment,bundle)
        }
        return binding.root

    }

}