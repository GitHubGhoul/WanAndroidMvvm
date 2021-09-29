package com.wxd.wanandroidmvvm.ui.entity

/**
 * curPage : 1
 * datas : [{"coinCount":38,"date":1621259074000,"desc":"2021-05-17 21:44:34 签到 , 积分：10 + 28","id":432030,"reason":"签到","type":1,"userId":91568,"userName":"15725106622"}]
 * offset : 0
 * over : false
 * pageCount : 2
 * size : 20
 * total : 29
 */
data class IntegralHistory(
    var curPage: Int = 0,
    var offset: Int = 0,
    var isOver: Boolean = false,
    var pageCount: Int = 0,
    var size: Int = 0,
    var total: Int = 0,
    var datas: List<DatasBean>? = null
) {
    /**
     * coinCount : 38
     * date : 1621259074000
     * desc : 2021-05-17 21:44:34 签到 , 积分：10 + 28
     * id : 432030
     * reason : 签到
     * type : 1
     * userId : 91568
     * userName : 15725106622
     */
    data class DatasBean(
        var coinCount: Int = 0,
        var date: Long = 0,
        var desc: String? = null,
        var id: Int = 0,
        var reason: String? = null,
        var type: Int = 0,
        var userId: Int = 0,
        var userName: String? = null
    )
}