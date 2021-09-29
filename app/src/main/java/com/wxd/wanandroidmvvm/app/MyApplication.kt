package com.wxd.wanandroidmvvm.app

import android.app.Application
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.lifecycle.ProcessLifecycleOwner
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStore
import androidx.lifecycle.ViewModelStoreOwner
import com.wxd.wanandroidmvvm.ext.KtxAppLifeObserver
import com.wxd.wanandroidmvvm.ext.KtxLifeCycleCallBack
import com.wxd.wanandroidmvvm.http.manage.NetworkStateReceive

class MyApplication : Application(), ViewModelStoreOwner {

    companion object {
        lateinit var instance: MyApplication
        lateinit var appViewModelInstance: AppViewModel
        private var mNetworkStateReceive: NetworkStateReceive? = null
    }

    private lateinit var mAppViewModelStore: ViewModelStore

    private var mFactory: ViewModelProvider.Factory? = null

    override fun getViewModelStore(): ViewModelStore {
        return mAppViewModelStore
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        mAppViewModelStore = ViewModelStore()
        appViewModelInstance = getAppViewModelProvider().get(AppViewModel::class.java)
        mNetworkStateReceive = NetworkStateReceive()
        registerReceiver(
            mNetworkStateReceive,
            IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION)
        )
        registerActivityLifecycleCallbacks(KtxLifeCycleCallBack())
        ProcessLifecycleOwner.get().lifecycle.addObserver(KtxAppLifeObserver)
    }

    fun getAppViewModelProvider(): ViewModelProvider {
        return ViewModelProvider(this, this.getAppFactory())
    }
    
    private fun getAppFactory(): ViewModelProvider.Factory {
        if (mFactory == null) {
            mFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(this)
        }
        return mFactory as ViewModelProvider.Factory
    }
}