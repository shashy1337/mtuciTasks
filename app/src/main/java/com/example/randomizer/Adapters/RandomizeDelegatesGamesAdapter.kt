package com.example.randomizer.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.randomizer.databinding.RandomizeItemBinding
import com.example.randomizer.interfaces.RecyclerViewItems
import com.example.randomizer.model.RandomizeGameDataClass
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate

class RandomizeDelegatesGamesAdapter(private val clickListener: OnItemClickListener)
    : AbsListItemAdapterDelegate<RandomizeGameDataClass, RecyclerViewItems,
        RandomizeDelegatesGamesAdapter.RandomizeGamesViewHolder>(){

    private lateinit var binding: RandomizeItemBinding


    class RandomizeGamesViewHolder(private val binding: RandomizeItemBinding)
        : RecyclerView.ViewHolder(binding.root){

        fun onBind(game : RandomizeGameDataClass){
            binding.randomizeTextItem.text = game.randomText
        }
    }

    override fun isForViewType(
        item: RecyclerViewItems,
        items: MutableList<RecyclerViewItems>,
        position: Int
    ): Boolean {
        return item is RandomizeGameDataClass
    }

    override fun onCreateViewHolder(parent: ViewGroup): RandomizeGamesViewHolder {
        binding = RandomizeItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)
        return RandomizeGamesViewHolder(binding)
    }

    override fun onBindViewHolder(
        item: RandomizeGameDataClass,
        holder: RandomizeGamesViewHolder,
        payloads: MutableList<Any>
    ) {
        holder.onBind(item)
    }


    interface OnItemClickListener {

        fun click(film : RandomizeGameDataClass)

    }

}