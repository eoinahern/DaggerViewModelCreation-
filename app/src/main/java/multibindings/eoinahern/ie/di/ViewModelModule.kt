package multibindings.eoinahern.ie.di

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import multibindings.eoinahern.ie.viewModels.MainActivityViewModel
import multibindings.eoinahern.ie.viewModels.SecondActivityViewModel


@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ClassKeyItem(MainActivityViewModel::class)
    abstract fun getVM(vm : MainActivityViewModel) : ViewModel

    @Binds
    @IntoMap
    @ClassKeyItem(SecondActivityViewModel::class)
    abstract fun getVMTwo(vm : SecondActivityViewModel) : ViewModel

}