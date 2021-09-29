package com.wxd.wanandroidmvvm.ui.fragment

import android.os.Bundle
import com.wxd.wanandroidmvvm.R
import com.wxd.wanandroidmvvm.base.BaseVmDbFragment
import com.wxd.wanandroidmvvm.databinding.FragmentMineBinding
import com.wxd.wanandroidmvvm.ui.viewmodel.MineViewModel

/**
 * @Author: wxd
 * @CreateDate: 2021/9/28 17:22
 * @Description: MineFragment
 */
class MineFragment:BaseVmDbFragment<MineViewModel, FragmentMineBinding>() {

    override fun layoutId(): Int {
        return R.layout.fragment_mine
    }

    override fun initView(savedInstanceState: Bundle?) {
        
    }
}