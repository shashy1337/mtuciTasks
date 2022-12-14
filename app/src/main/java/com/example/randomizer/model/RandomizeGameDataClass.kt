package com.example.randomizer.model

import android.os.Parcelable
import com.example.randomizer.interfaces.RecyclerViewItems
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RandomizeGameDataClass(
    val randomText : String
) : Parcelable, RecyclerViewItems
