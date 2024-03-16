package com.demoapparchitecurecomponent

import androidx.core.app.ActivityCompat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class UserModule {

    @Provides
    fun provideUserRepository() : UserRepository{
        return FirebaseRepository()
    }
}