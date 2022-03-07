package com.weather.ui.weatherdetail

import androidx.fragment.app.viewModels
import com.weather.BR
import com.weather.R
import com.weather.databinding.FragmentWeatherDetailBinding
import com.weather.ui.base.BaseFragment

class WeatherDetailFragment :
    BaseFragment<WeatherDetailViewModel, FragmentWeatherDetailBinding>(R.layout.fragment_weather_detail) {
    override val viewModel: WeatherDetailViewModel by viewModels()

    override fun getBindingVariable() = BR.viewModel
}