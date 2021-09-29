package com.wxd.wanandroidmvvm.ui.entity

/**
 * curPage : 1
 * datas : [{"author":"xiaoyang","chapterId":440,"chapterName":"官方","courseId":13,"desc":"
 *
 *在我们的印象里，如果构造一个 Dialog 传入一个非 Activiy 的 context，则可能会出现 bad token exception。<\/p>\r\n
 *
 *今天我们就来彻底搞清楚这一块，问题来了：<\/p>\r\n\r\n 1. 为什么传入一个非 Activity 的 context 会出现错误？<\/li>\r\n 1. 传入的 context 一定要是 Activity 吗？<\/li>\r\n<\/ol>","envelopePic":"","id":191387,"link":"https://www.wanandroid.com/wenda/show/18281","niceDate":"2021-05-13 23:42","origin":"","originId":18281,"publishTime":1620920531000,"title":"每日一问 | Dialog 的构造方法的 context 必须传入 Activity吗？","userId":91568,"visible":0,"zan":0}]
 * offset : 0
 * over : true
 * pageCount : 1
 * size : 20
 * total : 9
 */
data class CollectArticle(
    var curPage: Int = 0,
    var offset: Int = 0,
    var isOver: Boolean = false,
    var pageCount: Int = 0,
    var size: Int = 0,
    var total: Int = 0,
    var datas: List<DatasBean>? = null
) {
    /**
     * author : xiaoyang
     * chapterId : 440
     * chapterName : 官方
     * courseId : 13
     * desc :
     *
     *在我们的印象里，如果构造一个 Dialog 传入一个非 Activiy 的 context，则可能会出现 bad token exception。
     *
     * 今天我们就来彻底搞清楚这一块，问题来了：
     *
     *  1. 为什么传入一个非 Activity 的 context 会出现错误？
     *  1. 传入的 context 一定要是 Activity 吗？
     *
     * envelopePic :
     * id : 191387
     * link : https://www.wanandroid.com/wenda/show/18281
     * niceDate : 2021-05-13 23:42
     * origin :
     * originId : 18281
     * publishTime : 1620920531000
     * title : 每日一问 | Dialog 的构造方法的 context 必须传入 Activity吗？
     * userId : 91568
     * visible : 0
     * zan : 0
     */
    data class DatasBean(
        var author: String? = null,
        var chapterId: Int = 0,
        var chapterName: String? = null,
        var courseId: Int = 0,
        var desc: String? = null,
        var envelopePic: String? = null,
        var id: Int = 0,
        var link: String? = null,
        var niceDate: String? = null,
        var origin: String? = null,
        var originId: Int = 0,
        var publishTime: Long = 0,
        var title: String?,
        var visible: Int = 0,
        var zan: Int = 0,
    )
}