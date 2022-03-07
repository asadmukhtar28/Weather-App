package com.weather.ui.weatherlist

import androidx.fragment.app.viewModels
import com.weather.BR
import com.weather.R
import com.weather.databinding.FragmentWeatherListBinding
import com.weather.ui.base.BaseFragment
import com.weather.ui.weatherlist.adapter.WeatherListAdapter
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class WeatherListFragment :
    BaseFragment<WeatherListViewModel, FragmentWeatherListBinding>(R.layout.fragment_weather_list) {

    @Inject
    lateinit var adapter: WeatherListAdapter

    override val viewModel: WeatherListViewModel by viewModels()

    override fun getBindingVariable() = BR.viewModel

    override fun initUi() {
        viewBinding.rvWeatherList.adapter = adapter

        viewModel.data.observe(viewLifecycleOwner) { list ->
            adapter.weatherList.clear()
            adapter.weatherList.addAll(list)
            adapter.notifyDataSetChanged()
        }
    }
}