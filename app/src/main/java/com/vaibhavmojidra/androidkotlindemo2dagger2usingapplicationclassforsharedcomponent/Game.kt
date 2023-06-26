package com.vaibhavmojidra.androidkotlindemo2dagger2usingapplicationclassforsharedcomponent

import android.util.Log
import javax.inject.Inject

class Game @Inject constructor(){
    init {
        Log.i("MyTag","Game class initialized.")
    }

    fun isGameDownloaded(){
        Log.i("MyTag","Game is already downloaded.")
    }
}
