package viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import model.CounterModel

class CounterViewModel {
    var state by mutableStateOf(CounterModel(0))
    private set

    fun increment() {
        state = state.copy(count = state.count + 1)
    }
}