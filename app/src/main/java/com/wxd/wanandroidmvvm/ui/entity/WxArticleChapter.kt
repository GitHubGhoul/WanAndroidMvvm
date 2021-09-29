package com.wxd.wanandroidmvvm.ui.entity

/**
 * children : []
 * courseId : 13
 * id : 408
 * name : 鸿洋
 * order : 190000
 * parentChapterId : 407
 * userControlSetTop : false
 * visible : 1
 */
data class WxArticleChapter(
    var courseId: Int = 0,
    var id: Int = 0,
    var name: String? = null,
    var order: Int = 0,
    var parentChapterId: Int = 0,
    var isUserControlSetTop: Boolean = false,
    var visible: Int = 0,
    var children: List<*>? = null
)