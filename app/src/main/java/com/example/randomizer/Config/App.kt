package com.example.randomizer.Config

import android.app.Application
import com.example.randomizer.R
import com.example.randomizer.interfaces.RecyclerViewItems
import com.example.randomizer.model.RandomizeGameDataClass

class App : Application() {
    val itemList = listOf<RecyclerViewItems>(
        RandomizeGameDataClass(getString(R.string.eagle_and_tails)),
        RandomizeGameDataClass(getString(R.string.dices)),
        RandomizeGameDataClass(getString(R.string.random_digit_str)),
        RandomizeGameDataClass(getString(R.string.ball_8)),
        RandomizeGameDataClass(getString(R.string.list))
    )

    companion object {
        lateinit var instance : App
            private set
    }
}