package com.wxd.wanandroidmvvm.http.manage

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import com.wxd.wanandroidmvvm.utils.NetworkUtil

/**
 * 作者　: wxd
 * 时间　: 2021/09/28
 * 描述　: 网络变化接收器
 */
class NetworkStateReceive : BroadcastReceiver() {
    var isInit = true
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == ConnectivityManager.CONNECTIVITY_ACTION) {
            if(!isInit){
                if (!NetworkUtil.isConnected(context)) {
                    //收到没有网络时判断之前的值是不是有网络，如果有网络才提示通知 ，防止重复通知
                    NetworkStateManager.instance.mNetworkStateCallback.value?.let {
                        if(it){
                            //没网
                            NetworkStateManager.instance.mNetworkStateCallback.value = false
                        }
                        return
                    }
                    NetworkStateManager.instance.mNetworkStateCallback.value = false
                }else{
                    //收到有网络时判断之前的值是不是没有网络，如果没有网络才提示通知 ，防止重复通知
                    NetworkStateManager.instance.mNetworkStateCallback.value?.let {
                        if(!it){
                            //有网络了
                            NetworkStateManager.instance.mNetworkStateCallback.value = true
                        }
                        return
                    }
                    NetworkStateManager.instance.mNetworkStateCallback.value = true
                }
            }
            isInit = false
        }
    }
}