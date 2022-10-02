package com.example.randomizer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.randomizer.Activitys.MainActivity
import com.example.randomizer.Adapters.RandomizeAdapter
import com.example.randomizer.Config.App
import com.example.randomizer.R
import com.example.randomizer.databinding.FragmentMainRandomizeBinding

class MainFragmentRandomize : Fragment() {

    private lateinit var binding : FragmentMainRandomizeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRv()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil
            .inflate(inflater, R.layout.fragment_main_randomize, container, false)
        return binding.root
    }

    fun initRv(){
        val adapterRv = RandomizeAdapter(requireActivity() as MainActivity)
        binding.randomRecyclerView.apply {
            adapter = adapterRv
            layoutManager = LinearLayoutManager(requireContext())
        }
        adapterRv.items = App.instance.itemList
    }

}