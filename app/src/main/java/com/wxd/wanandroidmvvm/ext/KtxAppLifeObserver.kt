package com.wxd.wanandroidmvvm.ext

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @Author: wxd
 * @CreateDate: 2021/9/28 9:14
 * @Description: 应用前后台监听
 */
object KtxAppLifeObserver:LifecycleObserver {

    var isForeground = UnPeekLiveData<Boolean>()

    //在前台
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private  fun onForeground() {
        isForeground.value = true
    }

    //在后台
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private fun onBackground() {
        isForeground.value = false
    }

}