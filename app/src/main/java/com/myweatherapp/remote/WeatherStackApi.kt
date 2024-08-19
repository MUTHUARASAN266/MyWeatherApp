package com.myweatherapp.remote

import com.myweatherapp.model.WeatherStackDataItem
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherStackApi {
    @GET("current")
    suspend fun getCurrentWeather1(
        @Query("access_key") apiKey: String,
        @Query("query") location: String
    ): Response<WeatherStackDataItem>
}