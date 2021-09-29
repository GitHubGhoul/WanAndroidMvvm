package com.wxd.wanandroidmvvm.ui.entity

/**
 * curPage : 1
 * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":60,"chapterName":"Android Studio相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":12871,"link":"https://juejin.im/post/5e94815551882573af79b2a0","niceDate":"2020-04-14 00:05","niceShareDate":"2020-04-13 23:58","origin":"","prefix":"","projectLink":"","publishTime":1586793921000,"realSuperChapterId":150,"selfVisible":0,"shareDate":1586793515000,"shareUser":"鸿洋","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"数据库还可以这么看？（Android Studio 4.1 新特性）","type":0,"userId":2,"visible":1,"zan":0}]
 * offset : 0
 * over : false
 * pageCount : 3
 * size : 20
 * total : 42
 */
data class TreeArticle(
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
     * chapterId : 60
     * chapterName : Android Studio相关
     * collect : false
     * courseId : 13
     * desc :
     * descMd :
     * envelopePic :
     * fresh : false
     * host :
     * id : 12871
     * link : https://juejin.im/post/5e94815551882573af79b2a0
     * niceDate : 2020-04-14 00:05
     * niceShareDate : 2020-04-13 23:58
     * origin :
     * prefix :
     * projectLink :
     * publishTime : 1586793921000
     * realSuperChapterId : 150
     * selfVisible : 0
     * shareDate : 1586793515000
     * shareUser : 鸿洋
     * superChapterId : 60
     * superChapterName : 开发环境
     * tags : []
     * title : 数据库还可以这么看？（Android Studio 4.1 新特性）
     * type : 0
     * userId : 2
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
        var tags: List<*>? = null
    )
}