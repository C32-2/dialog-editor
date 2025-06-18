import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import ui.view.MainView
import viewmodel.CounterViewModel

fun main() = application {
    val viewModel = CounterViewModel()
    Window(onCloseRequest = ::exitApplication, title = "MVVM Button") {
        MainView(viewModel)
    }
}
