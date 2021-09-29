package com.wxd.wanandroidmvvm.base

import androidx.lifecycle.ViewModel
import com.wxd.wanandroidmvvm.ext.UnPeekLiveData

open class BaseViewModel : ViewModel() {

    val loadingChange: UILoadingChange by lazy { UILoadingChange() }

    inner class UILoadingChange() {
        //显示加载框
        val showDialog by lazy { UnPeekLiveData<String>() }

        //隐藏加载框
        val dismissDialog by lazy { UnPeekLiveData<Boolean>() }
    }
}