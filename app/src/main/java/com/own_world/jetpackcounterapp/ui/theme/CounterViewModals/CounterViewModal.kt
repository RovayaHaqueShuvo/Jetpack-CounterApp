package com.own_world.jetpackcounterapp.ui.theme.CounterViewModals

import androidx.compose.runtime.asIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModal:ViewModel() {
    //Private Property can't accessable any other source
    private val _Counter =  mutableIntStateOf(0)

    val Counter = _Counter.asIntState()

    fun inCrease() = _Counter.intValue++
}