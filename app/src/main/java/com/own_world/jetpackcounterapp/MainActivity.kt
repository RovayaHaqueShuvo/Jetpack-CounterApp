package com.own_world.jetpackcounterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.own_world.jetpackcounterapp.ui.theme.CounterViewModals.CounterViewModal
import com.own_world.jetpackcounterapp.ui.theme.JetpackCounterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting(vm= CounterViewModal())
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier, vm:CounterViewModal) {
    Column(
        modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "${vm.Counter.intValue}",
            fontSize = 80.sp,
            modifier = modifier.padding(16.dp)
        )
        Button(modifier = modifier.scale(1.5f),onClick = {vm.inCrease()}) {
            Text(text = "Click me", modifier = modifier.padding(5.dp), fontSize = 15.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting(vm=CounterViewModal())
}