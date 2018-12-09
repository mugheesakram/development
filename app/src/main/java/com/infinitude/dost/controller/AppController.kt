package com.infinitude.dost.controller

import android.app.Application


class AppController : Application() {

    companion object {
        lateinit var newInstance: AppController

        var isUpdate: Boolean = false

        fun getInstance(): AppController {
            return newInstance
        }

    }

    override fun onCreate() {
        super.onCreate()
        newInstance = this

    }


}