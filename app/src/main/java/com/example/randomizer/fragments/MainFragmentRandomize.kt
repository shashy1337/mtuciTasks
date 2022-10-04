package com.example.randomizer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.randomizer.Activity.MainActivity
import com.example.randomizer.Adapters.RandomizeAdapter
import com.example.randomizer.Config.App
import com.example.randomizer.R
import com.example.randomizer.databinding.FragmentMainRandomizeBinding
import com.example.randomizer.decorations.ItemDecorationsPadd

class MainFragmentRandomize : Fragment() {

    private lateinit var binding : FragmentMainRandomizeBinding
    private lateinit var adapterRV: RandomizeAdapter
    private val database = App.instance.itemList

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRv()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainRandomizeBinding
            .inflate(inflater, container, false)
        return binding.root
    }

    fun initRv(){
        val recyclerView = binding.randomRecyclerView
        adapterRV = RandomizeAdapter(requireActivity() as MainActivity)
        recyclerView.apply {
            adapter = adapterRV
            layoutManager = LinearLayoutManager(requireContext())
            addItemDecoration(
                ItemDecorationsPadd(16)
            )
        }
        adapterRV.items = database
    }

}