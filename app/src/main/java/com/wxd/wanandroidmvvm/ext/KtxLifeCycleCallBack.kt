package com.wxd.wanandroidmvvm.ext

import android.app.Activity
import android.app.Application
import android.os.Bundle
import com.wxd.wanandroidmvvm.utils.LogUtil

/**
 * 作者　: wxd
 * 时间　: 20120/1/7
 * 描述　:
 */
class KtxLifeCycleCallBack : Application.ActivityLifecycleCallbacks {

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        KtxActivityManger.pushActivity(activity)
        LogUtil.d("onActivityCreated : ${activity.localClassName}")
    }
    override fun onActivityStarted(activity: Activity) {
        LogUtil.d("onActivityStarted : ${activity.localClassName}")
    }

    override fun onActivityResumed(activity: Activity) {
        LogUtil.d("onActivityResumed : ${activity.localClassName}")
    }

    override fun onActivityPaused(activity: Activity) {
        LogUtil.d("onActivityPaused : ${activity.localClassName}")
    }


    override fun onActivityDestroyed(activity: Activity) {
        LogUtil.d("onActivityDestroyed : ${activity.localClassName}")
        KtxActivityManger.popActivity(activity)
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

    }

    override fun onActivityStopped(activity: Activity) {
        LogUtil.d("onActivityStopped : ${activity.localClassName}")
    }


}