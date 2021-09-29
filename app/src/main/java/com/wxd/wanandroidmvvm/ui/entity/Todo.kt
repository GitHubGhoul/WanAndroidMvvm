package com.wxd.wanandroidmvvm.ui.entity

/**
 * curPage : 1
 * datas : [{"completeDate":null,"completeDateStr":"","content":"丢卡","date":1623945600000,"dateStr":"2021-06-18","id":26244,"priority":3,"status":0,"title":"咋回事","type":0,"userId":91568},{"completeDate":null,"completeDateStr":"","content":"我要改了","date":1621267200000,"dateStr":"2021-05-18","id":26506,"priority":2,"status":0,"title":"测试修改","type":1,"userId":91568},{"completeDate":null,"completeDateStr":"","content":"测试内容","date":1616428800000,"dateStr":"2021-03-23","id":25645,"priority":1,"status":0,"title":"测试","type":1,"userId":91568},{"completeDate":null,"completeDateStr":"","content":"test content","date":1616428800000,"dateStr":"2021-03-23","id":25646,"priority":2,"status":0,"title":"test","type":2,"userId":91568}]
 * offset : 0
 * over : true
 * pageCount : 1
 * size : 20
 * total : 4
 */
data class Todo(
    var curPage: Int = 0,
    var offset: Int = 0,
    var isOver: Boolean = false,
    var pageCount: Int = 0,
    var size: Int = 0,
    var total: Int = 0,
    var datas: List<DatasBean>? = null
) {
    /**
     * completeDate : null
     * completeDateStr :
     * content : 丢卡
     * date : 1623945600000
     * dateStr : 2021-06-18
     * id : 26244
     * priority : 3
     * status : 0
     * title : 咋回事
     * type : 0
     * userId : 91568
     */
    data class DatasBean(
        var completeDate: Any? = null,
        var completeDateStr: String? = null,
        var content: String? = null,
        var date: Long = 0,
        var dateStr: String? = null,
        var id: Int = 0,
        var priority: Int = 0,
        var status: Int = 0,
        var title: String? = null,
        var type: Int = 0,
        var userId: Int = 0
    )
}