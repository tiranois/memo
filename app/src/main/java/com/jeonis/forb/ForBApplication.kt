package com.jeonis.forb

import android.app.Application
import io.realm.Realm

class ForBApplication : Application {
    constructor() : super()

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)

    }
}