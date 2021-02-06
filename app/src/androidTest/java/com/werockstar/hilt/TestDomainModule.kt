package com.werockstar.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TestDomainModule {

	@Provides @Singleton
	fun provideString() = "This is test domain"
}
