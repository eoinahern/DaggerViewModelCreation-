package multibindings.eoinahern.ie

import android.app.Application
import multibindings.eoinahern.ie.di.AppComponent
import multibindings.eoinahern.ie.di.ApplicationModule
import multibindings.eoinahern.ie.di.DaggerAppComponent


class MyApp : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().applicationModule(ApplicationModule(this)).build()
    }

    fun getAppComponent(): AppComponent {
        return appComponent
    }
}