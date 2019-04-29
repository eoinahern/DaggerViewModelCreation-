package multibindings.eoinahern.ie.viewModels

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class SecondActivityViewModel @Inject constructor() : ViewModel() {

    fun doStuff() {
        println("hello second Activity viewModel")
    }
}