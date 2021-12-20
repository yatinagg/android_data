package com.yatinagg.mvvm_cities.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.lifecycle.ViewModelProvider
import com.yatinagg.mvvm_cities.databinding.ActivityMainBinding
import com.yatinagg.mvvm_cities.viewmodel.CityViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: CityViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(this).get(CityViewModel::class.java)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        viewModel.getCityData().observe(this, { city ->
            binding.cityImage.setImageDrawable(
                ResourcesCompat.getDrawable(resources, city.img, applicationContext.theme)
            )
            binding.cityNameTV.text = city.name
            binding.cityPopulationTV.text = city.population.toString()
        })
    }
}