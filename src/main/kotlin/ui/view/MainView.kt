package ui.view

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import ui.component.CustomButton
import ui.theme.CustomTheme
import viewmodel.CounterViewModel

@Composable
fun MainView(viewModel: CounterViewModel) {
    CustomTheme {
        Scaffold {
            CustomButton(onClick = { viewModel.increment() }) {
                Text("Increment Counter: ${viewModel.state.count}")
            }
        }
    }
}