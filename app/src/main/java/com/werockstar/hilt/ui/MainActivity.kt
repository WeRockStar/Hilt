package com.werockstar.hilt.ui

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.werockstar.hilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

	@Inject lateinit var preferences: SharedPreferences
	@Inject lateinit var s: String

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setSupportActionBar(findViewById(R.id.toolbar))

		Log.d(MainActivity::class.simpleName, s)
	}
}
