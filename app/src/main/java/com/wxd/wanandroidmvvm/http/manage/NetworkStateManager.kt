package com.wxd.wanandroidmvvm.http.manage

import com.wxd.wanandroidmvvm.ext.UnPeekLiveData

/**
 * @Author: wxd
 * @CreateDate: 2021/9/27 15:21
 * @Description: 网络管理
 */
class NetworkStateManager private constructor() {

    val mNetworkStateCallback = UnPeekLiveData<Boolean>()

    companion object {
        val instance: NetworkStateManager by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            NetworkStateManager()
        }
    }

}