package com.example.tasks

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

class WellnessTask(val  id: Int, val label: String, initialChecked: Boolean = false){
    var checked by mutableStateOf(initialChecked)
}
private fun getWellnessTasks() = List(30) { i -> WellnessTask(i, "Task # $i")}


@Composable
fun WellnessTasksList(
    modifier: Modifier = Modifier,
    list: List<WellnessTask>,
    onCheckedTask: (WellnessTask, Boolean) -> Unit,
    onCloseTask: (WellnessTask) -> Unit,
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(
            items = list,
            key = { task -> task.id}
        ) {
            task -> 
            WellnessTaskItem(taskName = task.label, onClose = { onCloseTask(task)},
            checked = task.checked,
            onCheckedChange = { checked -> onCheckedTask(task, checked)})
        }
    }
}