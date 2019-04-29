package multibindings.eoinahern.ie.second

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import multibindings.eoinahern.ie.MyApp
import multibindings.eoinahern.ie.R
import multibindings.eoinahern.ie.di.DaggerViewModelFactory
import multibindings.eoinahern.ie.viewModels.SecondActivityViewModel
import javax.inject.Inject

class MainTwoActivity : AppCompatActivity() {

    @Inject
    lateinit var vmFactory: DaggerViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_two)

        (application as MyApp).getAppComponent().inject(this)

        val vm = ViewModelProviders.of(this, this.vmFactory).get(SecondActivityViewModel::class.java)
        vm.doStuff()
    }
}
