package com.wxd.wanandroidmvvm.ui.fragment

import android.os.Bundle
import com.wxd.wanandroidmvvm.R
import com.wxd.wanandroidmvvm.base.BaseVmDbFragment
import com.wxd.wanandroidmvvm.databinding.FragmentHomeBinding
import com.wxd.wanandroidmvvm.ui.viewmodel.HomeViewModel
import com.wxd.wanandroidmvvm.utils.LogUtil

/**
 * @Author: wxd
 * @CreateDate: 2021/9/28 17:22
 * @Description: HomeFragment
 */
class HomeFragment : BaseVmDbFragment<HomeViewModel, FragmentHomeBinding>() {

    override fun layoutId(): Int {
        return R.layout.fragment_home
    }

    override fun initView(savedInstanceState: Bundle?) {
        mViewModel.getBanner()
    }

    override fun createObserver() {
        super.createObserver()
        mViewModel.banners.observe(this,{
            LogUtil.e(it.toString())
        })
    }
}