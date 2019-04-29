package multibindings.eoinahern.ie.di

import dagger.MapKey

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.FUNCTION)
@MapKey
annotation class MyItemKey(val name: String)