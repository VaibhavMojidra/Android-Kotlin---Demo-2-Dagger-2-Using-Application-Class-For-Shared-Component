package com.vaibhavmojidra.androidkotlindemo2dagger2usingapplicationclassforsharedcomponent

import android.app.Application

class PlayGameApplication : Application() {
    lateinit var playGameComponent: PlayGameComponent

    //Purpose of using this Application is you don't need to add this boilerplate line * in all Activity assume you have to pass parameters or value as state and and state value in all different activity may cause manually inconsistency.
    override fun onCreate() {
        super.onCreate()
        playGameComponent=DaggerPlayGameComponent.create() //Line *
    }
}