package com.wxd.wanandroidmvvm.http.response

open class BaseResponse<T>(var errorCode: Int, var errorMsg: String, val data: T) {

    // 这里是示例，wanandroid 网站返回的 错误码为 0 就代表请求成功，请你根据自己的业务需求来改变
    fun isSuccess() = errorCode == 0

    fun getResponseCode() = errorCode

    fun getResponseData() = data

    fun getResponseMsg() = errorMsg
}
