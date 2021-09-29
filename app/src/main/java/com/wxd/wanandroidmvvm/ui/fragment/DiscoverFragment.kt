package com.wxd.wanandroidmvvm.ui.fragment

import android.os.Bundle
import com.wxd.wanandroidmvvm.R
import com.wxd.wanandroidmvvm.base.BaseVmDbFragment
import com.wxd.wanandroidmvvm.databinding.FragmentDiscoverBinding
import com.wxd.wanandroidmvvm.ui.viewmodel.DiscoverViewModel

/**
 * @Author: wxd
 * @CreateDate: 2021/9/28 17:22
 * @Description: DiscoverFragment
 */
class DiscoverFragment : BaseVmDbFragment<DiscoverViewModel, FragmentDiscoverBinding>() {

    override fun layoutId(): Int {
        return R.layout.fragment_discover
    }

    override fun initView(savedInstanceState: Bundle?) {

    }
}