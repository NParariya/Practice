package com.example.practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.practice.databinding.FragmentABinding
import androidx.navigation.findNavController


class AFragment : Fragment() {

    companion object {
        fun newInstance() = AFragment()
    }
    private lateinit var binding : FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(layoutInflater )

        binding.btn1.setOnClickListener {
        it.findNavController().navigate(R.id.action)

        }

        binding.btn2.setOnClickListener {
            it.findNavController().navigate(R.id.gotolast)
        }

        return binding.root

    }


}


