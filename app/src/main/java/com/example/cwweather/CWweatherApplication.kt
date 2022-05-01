package com.example.cwweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class CWweatherApplication : Application() {

    companion object{
        const val TOKEN = "DSK0z2epAjuyTZiN"
        @SuppressLint("StaticFileLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}