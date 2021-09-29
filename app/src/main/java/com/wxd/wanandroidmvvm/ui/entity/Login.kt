package com.wxd.wanandroidmvvm.ui.entity

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

/**
 * admin : false
 * chapterTops : []
 * coinCount : 0
 * collectIds : [16634,16929,17356,17564,17863,1848,18192,17874,15215]
 * email :
 * icon :
 * id : 91568
 * nickname : 15725106622
 * password :
 * publicName : 15725106622
 * token :
 * type : 0
 * username : 15725106622
 */
@Entity
data class Login(
    var isAdmin: Boolean = false,
    var coinCount: Int = 0,
    var email: String? = null,
    var icon: String? = null,

    @PrimaryKey
    var id: Int = 0,
    var nickname: String? = null,
    var password: String? = null,
    var publicName: String? = null,
    var token: String? = null,
    var type: Int = 0,
    var username: String? = null,

    @Ignore
    var chapterTops: List<*>? = null,

    @Ignore
    var collectIds: List<Int>? = null
)
