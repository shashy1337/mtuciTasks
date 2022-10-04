package com.example.randomizer.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.randomizer.R
import com.example.randomizer.databinding.ActivityMainBinding
import com.example.randomizer.model.RandomizeGameDataClass


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        navController = this.findNavController(R.id.myNavHostController)
    }

    fun launchDicesFragment(randomizeGameDataClass: RandomizeGameDataClass){

        when(randomizeGameDataClass.randomText){
            "Cгенерировать случайное число" -> navController
                .navigate(R.id.action_mainFragmentRandomize_to_generateRandomDigitFragment)
            "Игральные кости" -> navController
                .navigate(R.id.action_mainFragmentRandomize_to_dicesFragment)
            "Подрабысвание монетки" -> navController
                .navigate(R.id.action_mainFragmentRandomize_to_eagleAndTailsFragment)
        }

    }
}