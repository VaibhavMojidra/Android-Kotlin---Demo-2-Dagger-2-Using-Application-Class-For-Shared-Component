package com.vaibhavmojidra.androidkotlindemo2dagger2usingapplicationclassforsharedcomponent

import android.util.Log
import javax.inject.Inject

class PlayGame @Inject constructor(smartPhone:SmartPhone,game:Game){

    init {
        Log.i("MyTag","PlayGame class initialized.")
        smartPhone.isSmartPhoneAvailable()
        game.isGameDownloaded()
    }

    fun playGame() {
        Log.i("MyTag","Starting game...")
    }

}