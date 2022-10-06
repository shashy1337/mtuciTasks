package com.example.randomizer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.randomizer.R
import com.example.randomizer.databinding.FragmentEightBallBinding

class EightBallFragment : Fragment() {

    private lateinit var binding: FragmentEightBallBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        eightBallLogic()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEightBallBinding.inflate(inflater, container, false)
        return binding.root
    }

    fun eightBallLogic() {
        binding.predictButton.setOnClickListener{
            binding.responseWindow.text = answer()
        }
    }

    private fun answer(): String {
        val answers = listOf(
            "As I see it, yes.",
            "Ask again later.",
            "Better\n not tell you\n now.",
            "Cannot predict \nnow.",
            "Concentrate \nand ask \nagain.",
            "Don’t count on it.",
            "It is certain.",
            "It is decidedly so.",
            "Most likely.",
            "My reply is no.",
            "My sources\n say no.",
            "Outlook\n not so good.",
            "Outlook good.",
            "Reply hazy\n try again.",
            "Signs point to yes.",
            "Very doubtful.",
            "Without a doubt.",
            "Yes.",
            "Yes – definitely.",
            "You may rely on it."
        )

        return answers.random()
    }

}