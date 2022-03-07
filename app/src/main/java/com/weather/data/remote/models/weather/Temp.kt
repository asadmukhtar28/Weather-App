package com.weather.data.remote.models.weather

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Temp(
    @SerializedName("day")
    var day: Double = 0.0,

    @SerializedName("min")
    @Expose
    var min: Double = 0.0,

    @SerializedName("max")
    @Expose
    var max: Double = 0.0,

    @SerializedName("night")
    @Expose
    var night: Double = 0.0,

    @SerializedName("eve")
    @Expose
    var eve: Double = 0.0,

    @SerializedName("morn")
    @Expose
    var morn: Double = 0.0
)