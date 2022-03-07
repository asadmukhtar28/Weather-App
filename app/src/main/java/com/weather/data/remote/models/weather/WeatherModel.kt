package com.weather.data.remote.models.weather

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class WeatherModel(
    @SerializedName("city")
    @Expose
    var city: City? = null,

    @SerializedName("cod")
    @Expose
    var cod: String? = null,

    @SerializedName("message")
    @Expose
    var message: Double = 0.0,

    @SerializedName("cnt")
    @Expose
    var cnt: Long = 0,

    @SerializedName("list")
    @Expose
    var list: List<TemperatureList>? = null
)