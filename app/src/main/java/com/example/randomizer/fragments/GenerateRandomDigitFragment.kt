package com.example.randomizer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.randomizer.databinding.FragmentDigitRandomGenerateBinding
import kotlinx.android.synthetic.main.fragment_digit_random_generate.*
import kotlin.random.Random

class GenerateRandomDigitFragment : Fragment() {

    private lateinit var binding: FragmentDigitRandomGenerateBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRandomFunc()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDigitRandomGenerateBinding.inflate(inflater, container, false)
        return binding.root
    }


    fun initRandomFunc(){
        val button = binding.buttonRandom
        val numberStr = binding.number
        button.setOnClickListener {
            val randomValue = Random.nextInt(
                binding.textFieldRange1.editText?.text.toString().toInt(),
                binding.textFieldRange2.editText?.text.toString().toInt())
            numberStr.text = randomValue.toString()
        }
    }

}