package com.example.randomizer.Config

import android.app.Application
import com.example.randomizer.interfaces.RecyclerViewItems
import com.example.randomizer.model.RandomizeGameDataClass

class App : Application() {

    val itemList = listOf<RecyclerViewItems>(
        RandomizeGameDataClass("Игральные кости"),
        RandomizeGameDataClass("Подрабысвание монетки"),
        RandomizeGameDataClass("Cгенерировать случайное число"),
        RandomizeGameDataClass("Шар восьмерка"),
        RandomizeGameDataClass("Список")
    )

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance : App
            private set
    }
}