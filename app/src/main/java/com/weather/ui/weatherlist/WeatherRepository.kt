package com.weather.ui.weatherlist

import com.weather.BuildConfig
import com.weather.data.remote.ApiService
import com.weather.data.remote.models.base.State
import com.weather.data.remote.models.weather.WeatherModel
import com.weather.ui.base.BaseRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val apiService: ApiService) : BaseRepository() {

    private fun parseInputParams(latitude: String, longitude: String, unit: String) =
        HashMap<String, String>().apply {
            put("lat", latitude)
            put("lon", latitude)
            put("cnt", "10")
            put("unit", unit)
            put("appid", BuildConfig.API_KEY)
        }

    suspend fun getDailyWeatherForecast(
        latitude: String,
        longitude: String,
        unit: String
    ): Flow<State<WeatherModel>> {
        return flow {
            try {
                emit(State.Loading())
                val result = makeApiCall {
                    apiService.getDailyWeatherForecast(
                        parseInputParams(
                            latitude,
                            longitude,
                            unit
                        )
                    )
                }
                emit(result)
            } catch (e: IOException) {
                e.printStackTrace()
                emit(State.Error(State.ResponseError.InternetConnectionResponseError))
            } catch (e: IllegalStateException) {
                emit(State.Error(State.ResponseError.SomethingWentWrong()))
            }
        }

    }
}