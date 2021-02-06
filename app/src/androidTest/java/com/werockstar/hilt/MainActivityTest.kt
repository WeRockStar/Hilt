package com.werockstar.hilt

import com.werockstar.hilt.di.domain.DomainModule
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
@UninstallModules(DomainModule::class)
class MainActivityTest {

	@get:Rule(order = 1)
	val hiltRule = HiltAndroidRule(this)

	@Inject lateinit var s: String

	@Before
	fun setUp() {
		hiltRule.inject()
	}

	@Test
	fun this_is_a_test() {
		assertEquals("This is test domain", s)
	}
}
