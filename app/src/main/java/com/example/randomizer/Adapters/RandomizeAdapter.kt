package com.example.randomizer.Adapters

import android.annotation.SuppressLint
import com.example.randomizer.Activity.MainActivity
import com.example.randomizer.interfaces.RecyclerViewItems
import com.example.randomizer.model.RandomizeGameDataClass
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter

class RandomizeAdapter(requireActivity: MainActivity)
    : ListDelegationAdapter<List<RecyclerViewItems>>() {
        init {
            delegatesManager.addDelegate(RandomizeDelegatesGamesAdapter(object : RandomizeDelegatesGamesAdapter.OnItemClickListener{
                override fun click(game: RandomizeGameDataClass) {
                    (requireActivity).launchDicesFragment(game)
                }

            }))
        }

    @SuppressLint("NotifyDataSetChanged")
    override fun setItems(items: List<RecyclerViewItems>?) {
        super.setItems(items)
        notifyDataSetChanged()
    }
}