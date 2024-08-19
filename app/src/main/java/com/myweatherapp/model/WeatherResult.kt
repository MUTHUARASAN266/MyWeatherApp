package com.myweatherapp.model

sealed class WeatherResult{
    data class Success(val response:WeatherStackDataItem?): WeatherResult()
    data class Error(val response:WeatherStackDataItem?): WeatherResult()
    data class Loading(val isLoading: Boolean): WeatherResult()
}
