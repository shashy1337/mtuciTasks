package com.example.randomizer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.randomizer.databinding.FragmentDicesBinding
import kotlin.random.Random

class DicesFragment : Fragment() {

    private lateinit var binding: FragmentDicesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRandomFunc()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDicesBinding.inflate(inflater, container, false)
        return binding.root
    }


    fun initRandomFunc(){
        val button = binding.buttonRandom
        val numberStr = binding.number
        button.setOnClickListener {
            val randomValue = Random.nextInt(0, 100)
            numberStr.text = randomValue.toString()
        }
    }

}