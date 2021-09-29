package com.wxd.wanandroidmvvm.ui.entity

/**
 * admin : false
 * chapterTops : []
 * coinCount : 0
 * collectIds : []
 * email :
 * icon :
 * id : 99142
 * nickname : TestRegister
 * password :
 * publicName : TestRegister
 * token :
 * type : 0
 * username : TestRegister
 */
data class Register(
    var isAdmin: Boolean = false,
    var coinCount: Int = 0,
    var email: String? = null,
    var icon: String? = null,
    var id: Int = 0,
    var nickname: String? = null,
    var password: String? = null,
    var publicName: String? = null,
    var token: String? = null,
    var type: Int = 0,
    var username: String? = null,
    var chapterTops: List<*>? = null,
    var collectIds: List<*>? = null
)