// ExampleApp.kt

package com.myweatherapp

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.myweatherapp.utils.ThemePreferencesManager
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApp : Application(){
    override fun onCreate() {
        super.onCreate()
        applyTheme()
    }

    private fun applyTheme() {
        val isLightMode= ThemePreferencesManager.getTheme(this)
        setAppTheme(isLightMode)
    }

    fun setAppTheme(lightMode: Boolean) {
        if (lightMode){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
    }
}
