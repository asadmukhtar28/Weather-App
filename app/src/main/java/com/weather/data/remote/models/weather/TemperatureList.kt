package com.weather.data.remote.models.weather

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kotlin.collections.List

data class TemperatureList(
    @SerializedName("dt")
    @Expose
    var dt: Long = 0,

    @SerializedName("sunrise")
    @Expose
    var sunrise: Long = 0,

    @SerializedName("sunset")
    @Expose
    var sunset: Long = 0,

    @SerializedName("temp")
    @Expose
    var temp: Temp? = null,

    @SerializedName("feels_like")
    @Expose
    var feelsLike: FeelsLike? = null,

    @SerializedName("pressure")
    @Expose
    var pressure: Double = 0.0,

    @SerializedName("humidity")
    @Expose
    var humidity: Double = 0.0,

    @SerializedName("weather")
    @Expose
    var weather: List<Weather>? = null,

    @SerializedName("speed")
    @Expose
    var speed: Double = 0.0,

    @SerializedName("deg")
    @Expose
    var deg: Double = 0.0,

    @SerializedName("gust")
    @Expose
    var gust: Double = 0.0,

    @SerializedName("clouds")
    @Expose
    var clouds: Double = 0.0,

    @SerializedName("pop")
    @Expose
    var pop: Double = 0.0,

    @SerializedName("rain")
    @Expose
    var rain: Double = 0.0,
)