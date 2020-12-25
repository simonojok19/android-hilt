package com.example.android.hilt.di

import com.example.android.hilt.data.AppDatabase
import com.example.android.hilt.data.LogDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
object DatabaseModule {
    @Provides
    fun provideLogDao(database: AppDatabase): LogDao {
        return database.logDao()
    }
}