package com.wxd.wanandroidmvvm.utils

import android.util.Log


object LogUtil {

    private const val TAG = "WanAndroid"
    private const val DEBUG_ON = true

    fun d(message: String?) {
        if (DEBUG_ON) Log.d(TAG, message!!)
    }

    fun d(tag: String?,message: String?) {
        if (DEBUG_ON) Log.d(tag, message!!)
    }

    fun i(message: String?) {
        if (DEBUG_ON) Log.i(TAG, message!!)
    }

    fun i(tag: String?,message: String?) {
        if (DEBUG_ON) Log.i(tag, message!!)
    }

    fun w(message: String?) {
        if (DEBUG_ON) Log.w(TAG, message!!)
    }

    fun w(tag: String?,message: String?) {
        if (DEBUG_ON) Log.w(tag, message!!)
    }

    fun e(message: String?) {
        if (DEBUG_ON) Log.e(TAG, message!!)
    }

    fun e(tag: String?,message: String?) {
        if (DEBUG_ON) Log.e(tag, message!!)
    }

}