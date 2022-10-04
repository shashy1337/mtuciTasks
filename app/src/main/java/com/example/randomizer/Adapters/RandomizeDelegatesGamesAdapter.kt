package com.example.randomizer.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.randomizer.databinding.RandomizeItemBinding
import com.example.randomizer.interfaces.RecyclerViewItems
import com.example.randomizer.model.RandomizeGameDataClass
import com.hannesdorfmann.adapterdelegates4.AbsListItemAdapterDelegate
import kotlinx.android.synthetic.main.randomize_item.view.*

class RandomizeDelegatesGamesAdapter(private val clickListener: OnItemClickListener)
    : AbsListItemAdapterDelegate<RandomizeGameDataClass, RecyclerViewItems,
        RandomizeDelegatesGamesAdapter.RandomizeGamesViewHolder>(){

    private lateinit var binding: RandomizeItemBinding


    class RandomizeGamesViewHolder(private val binding: RandomizeItemBinding)
        : RecyclerView.ViewHolder(binding.root){

        private val textGame : TextView = binding.randomizeTextItem

        fun onBind(game : RandomizeGameDataClass){
            textGame.text = game.randomText
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
        when (holder) {
            else -> {
                holder.onBind(item)
                holder.itemView.cardView.setOnClickListener {
                    clickListener.click(item)
                }
            }
        }
    }

    interface OnItemClickListener {

        fun click(game : RandomizeGameDataClass)

    }

}