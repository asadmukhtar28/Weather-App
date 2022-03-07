package com.weather.ui.weatherlist.adapter

import androidx.lifecycle.MutableLiveData
import com.weather.data.remote.models.weather.TemperatureList

class ItemViewModel(val model : TemperatureList) {
    val temperature = MutableLiveData(model.temp?.day ?: 0.0)
    val humidity = MutableLiveData(model.humidity)
    val wind = MutableLiveData(model.speed)
}