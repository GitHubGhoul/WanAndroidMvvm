package com.wxd.wanandroidmvvm.ui.entity

/**
 * curPage : 1
 * datas : [{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":18316,"link":"https://mp.weixin.qq.com/s/exjTMsVmjlVI-Yj5O6_ebg","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1621094400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1621177358000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"说点面试真相","type":0,"userId":-1,"visible":1,"zan":0}]
 * offset : 0
 * over : false
 * pageCount : 60
 * size : 20
 * total : 1185
 */
data class WxArticle(
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
     * author : 鸿洋
     * canEdit : false
     * chapterId : 408
     * chapterName : 鸿洋
     * collect : false
     * courseId : 13
     * desc :
     * descMd :
     * envelopePic :
     * fresh : false
     * host :
     * id : 18316
     * link : https://mp.weixin.qq.com/s/exjTMsVmjlVI-Yj5O6_ebg
     * niceDate : 1天前
     * niceShareDate : 1天前
     * origin :
     * prefix :
     * projectLink :
     * publishTime : 1621094400000
     * realSuperChapterId : 407
     * selfVisible : 0
     * shareDate : 1621177358000
     * shareUser :
     * superChapterId : 408
     * superChapterName : 公众号
     * tags : [{"name":"公众号","url":"/wxarticle/list/408/1"}]
     * title : 说点面试真相
     * type : 0
     * userId : -1
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
        var tags: List<TagsBean>? = null
    ) {
        /**
         * name : 公众号
         * url : /wxarticle/list/408/1
         */
        data class TagsBean(
            var name: String? = null,
            var url: String? = null
        )
    }
}