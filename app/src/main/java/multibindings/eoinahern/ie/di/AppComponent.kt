package multibindings.eoinahern.ie.di


import dagger.Component
import multibindings.eoinahern.ie.main.MainActivity


@Component(modules = [ApplicationModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}