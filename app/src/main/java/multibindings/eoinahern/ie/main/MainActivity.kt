package multibindings.eoinahern.ie.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import multibindings.eoinahern.ie.MyApp
import multibindings.eoinahern.ie.R
import multibindings.eoinahern.ie.di.DaggerViewModelFactory
import multibindings.eoinahern.ie.second.MainTwoActivity
import multibindings.eoinahern.ie.viewModels.MainActivityViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var myMap: Map<String, String>

    @Inject
    lateinit var viewModelFactory: DaggerViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as MyApp).getAppComponent().inject(this)


        for (item: Map.Entry<String, String> in myMap) {
            println("${item.key} and ${item.value}")
        }

        btn.setOnClickListener {
            startActivity(Intent(this, MainTwoActivity::class.java))
        }

        val viewModel = ViewModelProviders.of(this, this.viewModelFactory).get(MainActivityViewModel::class.java)
        viewModel.doStuff()
    }
}
