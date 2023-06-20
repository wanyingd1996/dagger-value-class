package demo 

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

/**
 *
 */
@Module
object DemoModule {
  @Provides @IntoSet fun providePkg() = PackageName("hello")
  @Provides @IntoSet fun provideString() = "hello" 
}
