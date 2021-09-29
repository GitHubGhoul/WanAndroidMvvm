package com.wxd.wanandroidmvvm.ui.entity

/**
 * curPage : 1
 * datas : [{"apkLink":"","audit":1,"author":"miaowmiaow","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"采用 Kotlin 语言编写，单Activity多Fragment，MVVM + ViewModel + LiveData + Retrofit + 协程 + ViewBinding等架构设计的项目，项目结构清晰，代码简介优雅","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/6d454437-1e59-4804-9f75-7255b0e816a9.png","fresh":true,"host":"","id":18320,"link":"https://www.wanandroid.com/blog/show/3005","niceDate":"23小时前","niceShareDate":"23小时前","origin":"","prefix":"","projectLink":"https://github.com/miaowmiaow/FragmentProject.git","publishTime":1621177682000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1621177682000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"可能是东半球更简洁的玩安卓客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"SheHuan","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"基于 Vue2 + Vant 的移动版 玩Android 客户端","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/70ff438b-ca4e-420e-86f1-53387271d012.png","fresh":false,"host":"","id":18251,"link":"https://www.wanandroid.com/blog/show/2998","niceDate":"2021-05-09 23:44","niceShareDate":"2021-05-09 23:44","origin":"","prefix":"","projectLink":"https://github.com/SheHuan/wanandroid-vue","publishTime":1620575078000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1620575078000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"基于 Vue2 + Vant 的移动版 玩Android 客户端","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"Theoneee","canEdit":false,"chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"码云地址：https://gitee.com/theoneee/the-base-mvvm","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/ae8bea90-df9c-42db-a6ef-2a0ef1c93120.png","fresh":false,"host":"","id":17828,"link":"https://www.wanandroid.com/blog/show/2976","niceDate":"2021-04-01 22:20","niceShareDate":"2021-04-01 22:20","origin":"","prefix":"","projectLink":"https://github.com/Theoneee/TheBase-MVVM","publishTime":1617286820000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1617286820000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"QMUI+Jetpack组件搭建的一个基础框架写的一个玩安卓App","type":0,"userId":-1,"visible":1,"zan":0}]
 * offset : 0
 * over : false
 * pageCount : 18
 * size : 15
 * total : 258
 */
data class ProjectArticle(
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
     * author : miaowmiaow
     * canEdit : false
     * chapterId : 294
     * chapterName : 完整项目
     * collect : false
     * courseId : 13
     * desc : 采用 Kotlin 语言编写，单Activity多Fragment，MVVM + ViewModel + LiveData + Retrofit + 协程 + ViewBinding等架构设计的项目，项目结构清晰，代码简介优雅
     * descMd :
     * envelopePic : https://www.wanandroid.com/blogimgs/6d454437-1e59-4804-9f75-7255b0e816a9.png
     * fresh : true
     * host :
     * id : 18320
     * link : https://www.wanandroid.com/blog/show/3005
     * niceDate : 23小时前
     * niceShareDate : 23小时前
     * origin :
     * prefix :
     * projectLink : https://github.com/miaowmiaow/FragmentProject.git
     * publishTime : 1621177682000
     * realSuperChapterId : 293
     * selfVisible : 0
     * shareDate : 1621177682000
     * shareUser :
     * superChapterId : 294
     * superChapterName : 开源项目主Tab
     * tags : [{"name":"项目","url":"/project/list/1?cid=294"}]
     * title : 可能是东半球更简洁的玩安卓客户端
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
         * name : 项目
         * url : /project/list/1?cid=294
         */
        data class TagsBean(
            var name: String? = null,
            var url: String? = null
        )
    }
}