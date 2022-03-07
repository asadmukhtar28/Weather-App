package com.weather.data.remote.models.weather

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("id")
    @Expose
    var id: Long = 0,

    @SerializedName("name")
    @Expose
    var name: String? = null,

    @SerializedName("coord")
    @Expose
    var coord: Coord? = null,

    @SerializedName("country")
    @Expose
    var country: String? = null,

    @SerializedName("population")
    @Expose
    var population: Long = 0,

    @SerializedName("timezone")
    @Expose
    var timezone: Long = 0
)