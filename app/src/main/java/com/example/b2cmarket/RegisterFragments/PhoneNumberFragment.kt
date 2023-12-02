package com.example.b2cmarket.RegisterFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.text.isDigitsOnly
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
        binding.btnNext.setOnClickListener {
            if (!binding.edtPhoneNumber.text.toString().isNullOrEmpty() && binding.edtPhoneNumber.text.toString().length==9 && binding.edtPhoneNumber.text.toString().isDigitsOnly()){
                val bundle = Bundle()
                bundle.putString("phoneNumber", binding.edtPhoneNumber.text.toString())
                findNavController().navigate(R.id.checkPasswordFragment, bundle)
            }
            else{
                Toast.makeText(requireContext(), "Raqamda xatolik", Toast.LENGTH_SHORT).show()
            }


        }




        return binding.root

    }
}