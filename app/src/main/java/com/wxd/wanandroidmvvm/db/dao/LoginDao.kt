package com.wxd.wanandroidmvvm.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.wxd.wanandroidmvvm.ui.entity.Login

/**
 * @Author: wxd
 * @CreateDate: 2021/9/28 16:35
 * @Description: LoginDao
 */
@Dao
interface LoginDao {

    //存储轮播图
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveLogin(login: Login)

}