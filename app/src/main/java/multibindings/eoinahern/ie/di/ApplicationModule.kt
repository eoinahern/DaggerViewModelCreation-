package multibindings.eoinahern.ie.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoMap
import multibindings.eoinahern.ie.MyApp
import javax.inject.Singleton


@Module
class ApplicationModule(private val app: MyApp) {

    @Provides
    @Singleton
    fun getContext(): Context {
        return app.applicationContext
    }

    @Provides
    @IntoMap
    @MyItemKey("1")
    fun getNameOne(): String {
        return "eoin"
    }

    @Provides
    @IntoMap
    @MyItemKey("2")
    fun getNameTwo(): String {
        return "gazza"
    }

    @Provides
    @IntoMap
    @MyItemKey("3")
    fun getNameThree(): String {
        return "a midget"
    }
}