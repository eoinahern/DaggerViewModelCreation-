package multibindings.eoinahern.ie.viewModels

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainActivityViewModel @Inject constructor() : ViewModel() {

    fun doStuff() {
        println("hell main viewmodel!")
    }
}