package com.example.randomizer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.randomizer.databinding.FragmentListRandomBinding

class ListRandomFragment : Fragment() {

    private lateinit var binding: FragmentListRandomBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListRandomLogic()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListRandomBinding.inflate(inflater, container, false)
        return binding.root
    }

    fun initListRandomLogic(){
        val listOfItems = mutableListOf<String>()
        val editTextArgument = binding.textInputText
        val addedListWords = binding.addedListWords
        val number = binding.number

        binding.buttonSetItems.setOnClickListener {
            listOfItems.add(editTextArgument.editText?.text.toString())
            addedListWords.text = listOfItems.toString()
        }

        binding.buttonRandom.setOnClickListener {
            if (listOfItems.isNotEmpty()){
                val randomElement = listOfItems.random()
                number.text = randomElement
            }
        }

        binding.buttonDeleteItem.setOnClickListener {
            if (listOfItems.isNotEmpty()){
                listOfItems.remove(listOfItems.removeAt(0))
                addedListWords.text = listOfItems.toString()
            }
        }
    }

}