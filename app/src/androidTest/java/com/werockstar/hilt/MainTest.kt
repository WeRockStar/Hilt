package com.werockstar.hilt

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class MainTest {

	@get:Rule(order = 1)
	val hiltRule = HiltAndroidRule(this)

	@Inject lateinit var s: String

	@Before
	fun setUp() {
		hiltRule.inject()
	}

	@Test
	fun name() {
		assertEquals("This is domain", s)
	}
}
