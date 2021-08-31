package com.example.practice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.domain.Model.Model
import com.example.practice.databinding.FragmentDesignBinding


class DesignFragment : Fragment() {


    lateinit var viewModel : ViewModel
    private lateinit var binding : FragmentDesignBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDesignBinding.inflate(layoutInflater )
        setUpViewModel()
        setUpView()
        return binding.root

}private fun setUpView() {
        val tvname = binding.textView2
        val tvid = binding.textView3
        val button = binding.button

        button.setOnClickListener {
            button.setOnClickListener {
                viewModel.getJokeFromServer()
                Toast.makeText(context, "works",Toast.LENGTH_SHORT).show()
            }
        }

        viewModel.mylist.observe(viewLifecycleOwner, { Model ->
            Model?.let {
                tvname.text = it.name
                tvid.text = it.id
            }
        })
    }

    private fun setUpViewModel() {
        viewModel = ViewModelProvider(this, ViewModelFactory()).get(ViewModel::class.java)
    }

}