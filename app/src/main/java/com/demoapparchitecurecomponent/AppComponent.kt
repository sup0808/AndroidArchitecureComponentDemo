package com.demoapparchitecurecomponent

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AnalyticsModule::class])
interface AppComponent {

    fun getUserRegistrationComponent() : UserRegistrationServiceComponent
}