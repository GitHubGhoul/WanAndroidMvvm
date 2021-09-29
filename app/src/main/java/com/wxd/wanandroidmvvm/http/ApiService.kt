package com.wxd.wanandroidmvvm.http

import com.wxd.wanandroidmvvm.http.response.BaseResponse
import com.wxd.wanandroidmvvm.ui.entity.*
import retrofit2.http.*

/**
 * 作者　: wxd
 * 时间　: 2021/09/28
 * 描述　: 网络API
 */
interface ApiService {

    companion object {
        const val SERVER_URL = "https://wanandroid.com/"
    }

    //登录
    @POST("user/login")
    @FormUrlEncoded
    suspend fun login(
        @Field("username") username: String?,
        @Field("password") password: String?
    ): BaseResponse<Login>

    //注册
    @POST("user/register")
    @FormUrlEncoded
    suspend fun register(
        @Field("username") username: String?,
        @Field("password") password: String?,
        @Field("repassword") repassword: String?
    ): BaseResponse<Register>

    //退出登录
    @GET("user/logout/json")
    suspend fun loginOut(): BaseResponse<Any>

    //首页文章列表
    @GET("article/list/{page}/json")
    suspend fun homeArticle(@Path("page") page: Int): BaseResponse<HomeArticle>

    //置顶文章列表
    @GET("article/top/json")
    suspend fun topArticle(): BaseResponse<HomeArticle>

    //首页轮播图
    @GET("banner/json")
    suspend fun banner(): BaseResponse<List<Banner>>

    //搜索文章
    @POST("article/query/{page}/json")
    @FormUrlEncoded
    suspend fun queryArticle(
        @Path("page") page: Int,
        @Field("k") k: String?
    ): BaseResponse<HomeArticle>

    //搜索作者文章
    @GET("article/query/{page}/json")
    suspend fun queryAuthorArticle(
        @Path("page") page: Int,
        @Query("author") author: String?
    ): BaseResponse<HomeArticle>

    //热词
    @GET("hotkey/json")
    suspend fun hotKey(): BaseResponse<List<Hotkey>>

    //常用网站
    @GET("friend/json")
    suspend fun friend(): BaseResponse<Friend>

    //体系
    @GET("tree/json")
    suspend fun tree(): BaseResponse<List<Tree>>

    //体系下文章
    @GET("article/list/{page}/json")
    suspend fun treeArticle(
        @Path("page") page: Int,
        @Query("cid") cid: String?
    ): BaseResponse<TreeArticle>

    //导航
    @GET("navi/json")
    suspend fun navigation(): BaseResponse<List<Navigation>>

    //项目分类
    @GET("project/tree/json")
    suspend fun project(): BaseResponse<Project>

    //项目下文章
    @GET("article/list/{page}/json")
    suspend fun projectArticle(
        @Path("page") page: Int,
        @Query("cid") cid: String?
    ): BaseResponse<ProjectArticle>

    //最新项目
    @GET("article/listproject/{page}/json")
    suspend fun projectList(@Path("page") page: Int): BaseResponse<ProjectList>

    //微信公众号列表
    @GET("wxarticle/chapters/json")
    suspend fun wxArticle(): BaseResponse<WxArticleChapter>

    //微信公众号历史数据
    @GET("wxarticle/list/{id}/{page}/json")
    suspend fun wxArticleHistory(
        @Path("page") page: Int,
        @Path("id") id: Int
    ): BaseResponse<WxArticle>

    //微信公众号搜索数据
    @GET("wxarticle/list/{id}/{page}/json")
    suspend fun wxArticleQuery(
        @Path("page") page: Int,
        @Path("id") id: Int,
        @Query("k") k: String?
    ): BaseResponse<WxArticle>

    //广场列表
    @GET("user_article/list/{page}/json")
    suspend fun square(@Path("page") page: Int): BaseResponse<HomeArticle>

    //分享人对应列表
    @GET("user/{id}/share_articles/{page}/json")
    suspend fun shareUserArticle(
        @Path("page") page: Int,
        @Path("id") id: Int
    ): BaseResponse<ShareUserArticle>

    //自己分享的文章列表
    @GET("user/lg/private_articles/{page}/json")
    suspend fun sharePersonalArticle(@Path("page") page: Int): BaseResponse<ShareUserArticle>

    //删除自己分享的文章
    @POST("lg/user_article/delete/{id}/json")
    suspend fun deletePersonalArticle(@Path("id") id: Int): BaseResponse<Any>

    //分享文章
    @POST("lg/user_article/add/json")
    @FormUrlEncoded
    suspend fun shareArticle(
        @Field("title") title: String?,
        @Field("link") link: String?
    ): BaseResponse<Any>

    //问答
    @GET("wenda/list/{page}/json")
    suspend fun wenda(@Path("page") page: Int): BaseResponse<HomeArticle>

    //收藏列表
    @GET("lg/collect/list/{page}/json")
    suspend fun collectList(@Path("page") page: Int): BaseResponse<CollectArticle>

    //收藏站内文章
    @POST("lg/collect/{id}/json")
    suspend fun collectInArticle(@Path("id") id: Int): BaseResponse<Any>

    //收藏站外文章
    @POST("lg/collect/add/json")
    @FormUrlEncoded
    suspend fun collectOutArticle(
        @Field("title") title: String?,
        @Field("author") author: String?,
        @Field("link") link: String?
    ): BaseResponse<CollectOutArticle>

    //取消列表收藏
    @POST("lg/uncollect_originId/{id}/json")
    suspend fun cancelListCollect(@Path("id") id: Int): BaseResponse<Any>

    //取消我的收藏
    @POST("lg/uncollect/{id}/json")
    @FormUrlEncoded
    suspend fun cancelMyCollect(
        @Path("id") id: Int,
        @Field("originId") originId: String?
    ): BaseResponse<Any>

    //收藏网站列表
    @GET("lg/collect/usertools/json")
    suspend fun collectWebList(): BaseResponse<CollectWeb>

    //收藏网站
    @POST("lg/collect/addtool/json")
    @FormUrlEncoded
    suspend fun collectWeb(
        @Field("name") name: String?,
        @Field("link") link: String?
    ): BaseResponse<CollectWeb>

    //编辑收藏网站
    @POST("lg/collect/updatetool/json")
    @FormUrlEncoded
    suspend fun updateCollectWeb(
        @Field("id") id: Int,
        @Field("name") name: String?,
        @Field("link") link: String?
    ): BaseResponse<CollectWeb>

    //删除收藏网站
    @POST("lg/collect/deletetool/json")
    @FormUrlEncoded
    suspend fun deleteCollectWeb(@Field("id") id: Int): BaseResponse<Any>

    //积分排行榜
    @GET("coin/rank/{page}/json")
    suspend fun integralRank(@Path("page") page: Int): BaseResponse<IntegralRank>

    //获取个人积分
    @GET("lg/coin/userinfo/json")
    suspend fun integralPersonal(): BaseResponse<IntegralPersonal>

    //积分获取记录
    @GET("lg/coin/list/{page}/json")
    suspend fun integralHistory(@Path("page") page: Int): BaseResponse<IntegralHistory>

    //获取todo列表
    @GET("lg/todo/v2/list/{page}/json")
    suspend fun todoList(@Path("page") page: Int): BaseResponse<Todo>

    //添加todo
    @POST("lg/todo/add/json")
    @FormUrlEncoded
    suspend fun addTodo(@FieldMap map: Map<String?, String?>?): BaseResponse<Todo.DatasBean>

    //更新todo
    @POST("lg/todo/update/0/json")
    @FormUrlEncoded
    suspend fun updateTodo(@FieldMap map: Map<String?, String?>?): BaseResponse<Todo.DatasBean>

    //只更新todo status
    @POST("lg/todo/done/{id}/json")
    @FormUrlEncoded
    suspend fun updateStatusTodo(
        @Path("id") id: Int,
        @Field("status") status: Int
    ): BaseResponse<Todo.DatasBean>

    //删除todo
    @POST("lg/todo/delete/{id}/json")
    suspend fun deleteTodo(@Path("id") id: Int): BaseResponse<Any>

}