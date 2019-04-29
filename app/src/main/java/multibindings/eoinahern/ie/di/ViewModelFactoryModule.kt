package multibindings.eoinahern.ie.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module


@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun getFactory(daggerVm: DaggerViewModelFactory): ViewModelProvider.Factory

}