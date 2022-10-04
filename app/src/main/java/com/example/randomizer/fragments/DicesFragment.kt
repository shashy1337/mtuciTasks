package com.example.randomizer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.contains
import com.example.randomizer.R
import com.example.randomizer.databinding.FragmentDicesBinding
import kotlinx.android.synthetic.main.fragment_dices.*
import kotlinx.android.synthetic.main.fragment_dices.view.*
import kotlin.random.Random
import kotlin.random.nextInt

class DicesFragment : Fragment() {

    private lateinit var binding: FragmentDicesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        diceLogicRandomize()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDicesBinding.inflate(inflater, container, false)
        return binding.root
    }

    fun diceLogicRandomize(){
        val dice1 = binding.dice1
        val dice2 = binding.dice2
        val container = binding.diceContainer
        val buttonChoiceDice1 = binding.buttonChoiceDice1
        val buttonChoiceDice2 = binding.buttonChoiceDice2

        val buttonThrow = binding.throwButton

        buttonChoiceDice1.setOnClickListener {
            textInfoDice.text = "Бросьте кубик!"
            if (dice2 in container){
                container.removeView(dice2)
            }

        }

        buttonChoiceDice2.setOnClickListener {
            textInfoDice.text = "Бросьте кубики!"
            if (dice2 !in container){
                container.addView(dice2)
            }
        }

        buttonThrow.setOnClickListener {
            if(dice1 in container && dice2 in container){
                dice1.text = Random.nextInt(1,7).toString()
                dice2.text = Random.nextInt(1,7).toString()
            } else {
                dice1.text = Random.nextInt(1,7).toString()
            }
        }
    }

}