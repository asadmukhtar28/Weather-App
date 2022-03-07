package com.weather.data.remote

import com.weather.data.remote.models.weather.WeatherModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface ApiService {
    @GET("data/2.5/forecast/daily")
    suspend fun getDailyWeatherForecast(
        @QueryMap params: HashMap<String, String>
    ): Response<WeatherModel>
}