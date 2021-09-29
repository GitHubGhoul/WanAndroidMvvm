package com.wxd.wanandroidmvvm.db

import com.wxd.wanandroidmvvm.app.appDatabase
import com.wxd.wanandroidmvvm.ui.entity.Login
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

//双重校验锁式-单例 DbHelper 方便直接快速调用简单的接口
val dbHelper: DbHelper by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
    DbHelper.INSTANCE
}


/**
 * time   : 2021/09/28
 * desc   : 本地数据库帮助类，可以把需要的数据处理好，直接提供给外层，外层不需要知道数据过程
 * version: 1.0
 */
class DbHelper{

    companion object {
        private const val TAG = "DbHelper"
        val INSTANCE: DbHelper by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            DbHelper()
        }
    }

    /**
     * 保存轮播图
     */
    fun saveBanner(login: Login) {
        GlobalScope.launch {
            appDatabase.loginDao().saveLogin(login)
        }
    }
}