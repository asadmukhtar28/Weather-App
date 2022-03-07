package com.weather.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {
    /* @Singleton
     @Provides
     fun provideAppDatabase(@ApplicationContext context: Context): AppDatabase {
         return AppDatabase.getInstance(context)
     }

     @Provides
     fun provideCurrenciesDao(appDatabase: AppDatabase): CurrenciesDao {
         return appDatabase.currenciesDao()
     }*/

}