package com.bigneardranch.criminalintent

import android.app.Application
import com.bigneardranch.criminalintent.database.CrimeRepository

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}