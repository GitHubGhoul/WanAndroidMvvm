package com.wxd.wanandroidmvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import com.wxd.wanandroidmvvm.base.BaseViewModel
import com.wxd.wanandroidmvvm.ext.request
import com.wxd.wanandroidmvvm.http.apiService
import com.wxd.wanandroidmvvm.ui.entity.Banner

class HomeViewModel : BaseViewModel() {

    var banners = MutableLiveData<List<Banner>>()

    fun getBanner() {
        request({
            apiService.banner()
        }, {
            banners.value = it
        }, {
            it.printStackTrace()
        },true)
    }
}