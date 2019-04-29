package multibindings.eoinahern.ie.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import multibindings.eoinahern.ie.MyApp
import multibindings.eoinahern.ie.R
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var myMap : Map<String, String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         (application as MyApp).getAppComponent().inject(this)


        for( item : Map.Entry<String,String> in myMap) {
            println("${item.key} and ${item.value}")
        }
    }
}
