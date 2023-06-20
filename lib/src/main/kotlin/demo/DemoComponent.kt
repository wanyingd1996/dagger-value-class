package demo 

import dagger.Component

/**
 *
 */
@Component(modules = [DemoModule::class])
interface DemoComponent {
  fun getPackageName(): Set<PackageName>
}
