package com.wxd.wanandroidmvvm.ui.entity

/**
 * curPage : 1
 * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":18328,"link":"https://juejin.cn/post/6963190541471186957","niceDate":"3小时前","niceShareDate":"3小时前","origin":"","prefix":"","projectLink":"","publishTime":1621245717000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1621245717000,"shareUser":"sweetying","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"&quot;Kotlin&quot;系列: 三、Kotlin协程上篇","type":0,"userId":5405,"visible":1,"zan":0}]
 * offset : 0
 * over : false
 * pageCount : 525
 * size : 20
 * total : 10484
 */
data class HomeArticle(
    var curPage: Int = 0,
    var offset: Int = 0,
    var isOver: Boolean = false,
    var pageCount: Int = 0,
    var size: Int = 0,
    var total: Int = 0,
    var datas: List<DatasBean>? = null
) {
    /**
     * apkLink :
     * audit : 1
     * author :
     * canEdit : false
     * chapterId : 502
     * chapterName : 自助
     * collect : false
     * courseId : 13
     * desc :
     * descMd :
     * envelopePic :
     * fresh : true
     * host :
     * id : 18328
     * link : https://juejin.cn/post/6963190541471186957
     * niceDate : 3小时前
     * niceShareDate : 3小时前
     * origin :
     * prefix :
     * projectLink :
     * publishTime : 1621245717000
     * realSuperChapterId : 493
     * selfVisible : 0
     * shareDate : 1621245717000
     * shareUser : sweetying
     * superChapterId : 494
     * superChapterName : 广场Tab
     * tags : []
     * title : &quot;Kotlin&quot;系列: 三、Kotlin协程上篇
     * type : 0
     * userId : 5405
     * visible : 1
     * zan : 0
     */
    data class DatasBean(
        var apkLink: String? = null,
        var audit: Int = 0,
        var author: String? = null,
        var isCanEdit: Boolean = false,
        var chapterId: Int = 0,
        var chapterName: String? = null,
        var isCollect: Boolean = false,
        var courseId: Int = 0,
        var desc: String? = null,
        var descMd: String? = null,
        var envelopePic: String? = null,
        var isFresh: Boolean = false,
        var host: String? = null,
        var id: Int = 0,
        var link: String? = null,
        var niceDate: String? = null,
        var niceShareDate: String? = null,
        var origin: String? = null,
        var prefix: String? = null,
        var projectLink: String? = null,
        var publishTime: Long = 0,
        var realSuperChapterId: Int = 0,
        var selfVisible: Int = 0,
        var shareDate: Long = 0,
        var shareUser: String? = null,
        var superChapterId: Int = 0,
        var superChapterName: String? = null,
        var title: String? = null,
        var type: Int = 0,
        var userId: Int = 0,
        var visible: Int = 0,
        var zan: Int = 0,
        var tags: List<Tags>? = null
    ) {
        /**
         * name : 本站发布
         * url : /article/list/0?cid=440
         */
        data class Tags(
            var name: String? = null,
            var url: String? = null
        )
    }
}