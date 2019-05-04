package com.padcmyanmar.mmnews.kotlin.mvp.presenter

import org.greenrobot.eventbus.EventBus

open abstract class BasePresenter {

    fun onCreate() {
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this)
        }
    }

    abstract fun onStart()

    abstract fun onStop()

    fun onDestroy() {
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this)
        }

    }

}