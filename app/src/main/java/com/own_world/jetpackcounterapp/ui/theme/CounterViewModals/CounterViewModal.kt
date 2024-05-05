package com.own_world.jetpackcounterapp.ui.theme.CounterViewModals

import androidx.compose.runtime.asIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModal:ViewModel() {
    //Private Property can't accessable any other source
    private val _counter =  mutableIntStateOf(0)

    val counter = _counter.asIntState()

    fun inCrease() = _counter.intValue++
}