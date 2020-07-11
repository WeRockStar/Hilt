package com.werockstar.hilt.di

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@Module
@InstallIn(ActivityComponent::class)
class DataModule {

	@Provides
	fun provideSharePreference(@ApplicationContext application: Context): SharedPreferences =
		application.getSharedPreferences("foo", Context.MODE_PRIVATE)
}
