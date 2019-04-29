package multibindings.eoinahern.ie.di


import dagger.Component
import multibindings.eoinahern.ie.main.MainActivity
import multibindings.eoinahern.ie.second.MainTwoActivity


@Component(modules = [ApplicationModule::class, ViewModelFactoryModule::class, ViewModelModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MainTwoActivity)
}