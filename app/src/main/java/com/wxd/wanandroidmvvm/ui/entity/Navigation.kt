package com.wxd.wanandroidmvvm.ui.entity

/**
 * articles : [{"apkLink":"","audit":1,"author":"小编","canEdit":false,"chapterId":272,"chapterName":"常用网站","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":1848,"link":"https://developers.google.cn/","niceDate":"2018-01-07 18:59","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1515322795000,"realSuperChapterId":0,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":0,"superChapterName":"","tags":[],"title":"Google开发者","type":0,"userId":-1,"visible":0,"zan":0}]
 * cid : 287
 * name : 直播SDK
 */
data class Navigation(
    var cid: Int = 0,
    var name: String? = null,
    var articles: List<ArticlesBean>? = null
) {
    /**
     * apkLink :
     * audit : 1
     * author : 小编
     * canEdit : false
     * chapterId : 272
     * chapterName : 常用网站
     * collect : false
     * courseId : 13
     * desc :
     * descMd :
     * envelopePic :
     * fresh : false
     * host :
     * id : 1848
     * link : https://developers.google.cn/
     * niceDate : 2018-01-07 18:59
     * niceShareDate : 未知时间
     * origin :
     * prefix :
     * projectLink :
     * publishTime : 1515322795000
     * realSuperChapterId : 0
     * selfVisible : 0
     * shareDate : null
     * shareUser :
     * superChapterId : 0
     * superChapterName :
     * tags : []
     * title : Google开发者
     * type : 0
     * userId : -1
     * visible : 0
     * zan : 0
     */
    data class ArticlesBean(
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
        var shareDate: Any? = null,
        var shareUser: String? = null,
        var superChapterId: Int = 0,
        var superChapterName: String? = null,
        var title: String? = null,
        var type: Int = 0,
        var userId: Int = 0,
        var visible: Int = 0,
        var zan: Int = 0,
        var tags: List<*>? = null
    )
}