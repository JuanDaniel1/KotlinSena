package com.example.tasks
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import android.annotation.SuppressLint
import android.os.Debug.InstructionCount
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp




@Composable
fun StatelessCounter(count: Int, onIncrement: () -> Unit, onDelete: () -> Unit) {
    Column {
        if (count > 0) {
            Text("You've had $count glasses.")
        }
        Row(Modifier.padding(top = 8.dp)) {
            Button(onClick = onIncrement, enabled = count < 10) {
                Text("Add one")
            }
            Button(onClick = onDelete, Modifier.padding(start = 8.dp)) {
                Text("Clear water count")
            }
        }
    }
}

@Composable
fun AnotherStatelessMethod(count: Int, onIncrement: () -> Unit, modifier: Modifier = Modifier){
    Column(modifier = modifier.padding(16.dp)) {
        if (count > 0) {
            Text("You've had $count steps.")
        }
        Button(onClick = onIncrement, Modifier.padding(top = 8.dp), enabled = count < 10) {
            Text("Add one")
        }

    }
}

@Composable
fun StatefulCounter() {
    var count by rememberSaveable {
        mutableStateOf(0)
    }
    StatelessCounter(count = count, onIncrement = { count++}, onDelete = { count = 0})

}