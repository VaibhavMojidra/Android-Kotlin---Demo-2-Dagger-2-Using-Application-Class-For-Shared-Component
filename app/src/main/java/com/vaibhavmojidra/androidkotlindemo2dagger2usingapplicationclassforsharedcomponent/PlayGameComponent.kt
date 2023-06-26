package com.vaibhavmojidra.androidkotlindemo2dagger2usingapplicationclassforsharedcomponent

import dagger.Component

@Component
interface PlayGameComponent {
    fun getPlayGame():PlayGame
}