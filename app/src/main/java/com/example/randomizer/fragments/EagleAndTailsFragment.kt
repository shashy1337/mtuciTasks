package com.example.randomizer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.randomizer.R
import com.example.randomizer.databinding.FragmentEagleAndTailsBinding
import kotlin.random.Random

class EagleAndTailsFragment : Fragment() {

    private lateinit var binding: FragmentEagleAndTailsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initEagleAndTaleGame()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEagleAndTailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    fun initEagleAndTaleGame(){
        val button = binding.eagleReshkaButton
        val list = listOf(
            R.drawable.eagle, R.drawable.reshka
        )

        button.setOnClickListener {
            binding.eagleReshka.setImageResource(list.random())
        }
    }

}