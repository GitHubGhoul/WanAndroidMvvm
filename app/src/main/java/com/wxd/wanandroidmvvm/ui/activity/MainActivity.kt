package com.wxd.wanandroidmvvm.ui.activity

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.ashokvarma.bottomnavigation.BottomNavigationBar
import com.ashokvarma.bottomnavigation.BottomNavigationItem
import com.wxd.wanandroidmvvm.R
import com.wxd.wanandroidmvvm.base.BaseVmDbActivity
import com.wxd.wanandroidmvvm.databinding.ActivityMainBinding
import com.wxd.wanandroidmvvm.ui.fragment.DiscoverFragment
import com.wxd.wanandroidmvvm.ui.fragment.HomeFragment
import com.wxd.wanandroidmvvm.ui.fragment.MineFragment
import com.wxd.wanandroidmvvm.ui.viewmodel.MainViewModel
import com.wxd.wanandroidmvvm.utils.ToastUtil

class MainActivity : BaseVmDbActivity<MainViewModel, ActivityMainBinding>() {

    private var homeFragment: HomeFragment? = null
    private var discoverFragment: DiscoverFragment? = null
    private var mineFragment: MineFragment? = null
    private var transaction: FragmentTransaction? = null
    private var mFragment: Fragment? = null //当前显示的Fragment
    private var exitTime: Long = 0


    override fun layoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView(savedInstanceState: Bundle?) {
        initializeBottomNavigationBar()
        initFragment()
    }

    private fun initializeBottomNavigationBar() {
        //设置模式
        mDatabind.bottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED)
        //设置背景色样式
        mDatabind.bottomNavigationBar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
        //添加颜色样式
        mDatabind.bottomNavigationBar.setActiveColor(R.color.tab_active)
            .setInActiveColor(R.color.tab_inactive)
        //添加tab
        mDatabind.bottomNavigationBar
            .addItem(BottomNavigationItem(R.drawable.tab_home, "首页"))
            .addItem(BottomNavigationItem(R.drawable.tab_discover, "发现"))
            .addItem(BottomNavigationItem(R.drawable.tab_mine, "我的"))
            .setFirstSelectedPosition(0)
            .initialise()
        mDatabind.bottomNavigationBar.setTabSelectedListener(object :
            BottomNavigationBar.OnTabSelectedListener {
            override fun onTabSelected(position: Int) {
                when (position) {
                    0 -> switchFragment(homeFragment!!)
                    1 -> switchFragment(discoverFragment!!)
                    2 -> switchFragment(mineFragment!!)
                    else -> {
                    }
                }
            }

            override fun onTabUnselected(position: Int) {}
            override fun onTabReselected(position: Int) {}
        })
    }

    private fun initFragment() {
        homeFragment = HomeFragment()
        discoverFragment = DiscoverFragment()
        mineFragment = MineFragment()
        transaction = supportFragmentManager.beginTransaction()
        transaction?.add(R.id.mFrameLayout, homeFragment!!)?.commit()
        mFragment = homeFragment
    }

    private fun switchFragment(fragment: Fragment) {
        //判断当前显示的Fragment是不是切换的Fragment
        if (mFragment !== fragment) {
            //判断切换的Fragment是否已经添加过
            if (!fragment.isAdded) {
                //如果没有，则先把当前的Fragment隐藏，把切换的Fragment添加上
                supportFragmentManager.beginTransaction().hide(mFragment!!)
                    .add(R.id.mFrameLayout, fragment).commit()
            } else {
                //如果已经添加过，则先把当前的Fragment隐藏，把切换的Fragment显示出来
                supportFragmentManager.beginTransaction().hide(mFragment!!).show(fragment).commit()
            }
            mFragment = fragment
        }
    }

    override fun onBackPressed() {
        if (System.currentTimeMillis() - exitTime > 2000) {
            ToastUtil.showShort("再按一次退出程序")
            exitTime = System.currentTimeMillis()
        } else {
            finish()
        }
    }

}