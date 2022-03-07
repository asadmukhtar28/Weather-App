package com.weather.ui.weatherlist

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weather.data.remote.models.base.State
import com.weather.data.remote.models.weather.TemperatureList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WeatherListViewModel @Inject constructor(private val repository: WeatherRepository) :
    ViewModel() {
    val isError = MutableLiveData<Boolean>()
    val isLoading = MutableLiveData<Boolean>()
    val data = MutableLiveData<List<TemperatureList>>()

    init {
        fetchCurrentWeatherReport()
    }

    fun fetchCurrentWeatherReport(
        latitude: Double = 31.5204,
        longitude: Double = 74.3587,
        unit: String = "imperial"
    ) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.getDailyWeatherForecast(
                latitude = latitude.toString(), longitude = longitude.toString(),
                unit
            ).collect {
                Log.d("asad_api", "it : $it")
                when (it) {
                    is State.Loading -> {
                        isLoading.postValue(true)
                    }
                    is State.Success -> {
                        isLoading.postValue(false)
                        it.wrapperData.list?.let {
                            data.postValue(it)
                        }
                    }
                    is State.Error -> {
                        isLoading.postValue(false)
                        isError.postValue(false)
                    }
                }
            }
        }
    }

}