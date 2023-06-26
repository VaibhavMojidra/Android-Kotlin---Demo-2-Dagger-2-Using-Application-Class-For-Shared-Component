package com.vaibhavmojidra.androidkotlindemo2dagger2usingapplicationclassforsharedcomponent

import android.util.Log
import javax.inject.Inject

class SmartPhone @Inject constructor(){
    init {
        Log.i("MyTag","Smartphone class initialized.")
    }

    fun isSmartPhoneAvailable(){
        Log.i("MyTag","SmartPhone is available.")
    }
}
