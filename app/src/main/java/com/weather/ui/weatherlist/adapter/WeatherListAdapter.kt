package com.weather.ui.weatherlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.weather.data.remote.models.weather.TemperatureList
import com.weather.databinding.ItemWeatherBinding
import com.weather.ui.base.BaseViewHolder
import javax.inject.Inject

class WeatherListAdapter @Inject constructor() :
    RecyclerView.Adapter<WeatherListAdapter.ItemViewHolder>() {
    val weatherList: MutableList<TemperatureList> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemWeatherBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount() = weatherList.size

    inner class ItemViewHolder(private val binding: ItemWeatherBinding) :
        BaseViewHolder(binding.root) {
        override fun onBind(position: Int) {
            binding.viewModel = ItemViewModel(weatherList[position])
            binding.executePendingBindings()
        }
    }
}