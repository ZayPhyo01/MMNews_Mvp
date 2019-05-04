package com.padcmyanmar.mmnews.kotlin.activities

import android.support.v7.app.AppCompatActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

open class BaseActivity : AppCompatActivity() {

    override fun onStart() {
        super.onStart()

    }

    override fun onStop() {
        super.onStop()

    }

    @Subscribe
    fun onEvent(event : Any?) {

    }
}