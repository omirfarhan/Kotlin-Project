package com.example.myapplication.`4LayoutComposable`

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.util.fastForEachIndexed

@Composable

fun CheckboxSystem() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // Snapshot-state list — Compose এটাকে দেখে রিকম্পোজ করবে যখন মান পরিবর্তন হবে
        val childCheckedState = remember{
            mutableStateListOf(false, false, false)
        }

        val parentState = when {
            childCheckedState.all { it } -> ToggleableState.On
            childCheckedState.none {it} -> ToggleableState.Off
            else -> ToggleableState.Indeterminate
        }

        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text("Select All")
                TriStateCheckbox(
                    state = parentState,
                    onClick = {
                        // যদি parent এখন On না থাকে -> set all true; অন্যথা set all false

                        val newValue= if (parentState== ToggleableState.On){
                            false
                        }else{
                            true
                        }

                        for (i in childCheckedState.indices) {
                            childCheckedState[i] = newValue
                        }
                    }
                )
            }

            childCheckedState.forEachIndexed { index, checked ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Option ${index + 1}")
                    Checkbox(
                        checked = checked,
                        onCheckedChange = { isChecked ->
                            childCheckedState[index] = isChecked
                        }
                    )
                }
            }
        }

        if (childCheckedState.all { it }) {
            Text("TEXT OPTION SELECTED")
        }
    }
}



@Preview(showSystemUi = true)
@Composable
fun showCHECKBOX(){
    CheckboxSystem()
}


