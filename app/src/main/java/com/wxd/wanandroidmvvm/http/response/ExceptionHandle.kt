package com.wxd.wanandroidmvvm.http.response

import android.net.ParseException
import com.google.gson.JsonParseException
import com.google.gson.stream.MalformedJsonException
import org.json.JSONException
import retrofit2.HttpException
import java.io.InterruptedIOException
import java.net.ConnectException

object ExceptionHandle {

    fun handleException(e: Throwable?): BaseException {
        val ex: BaseException
        e?.let {
            when (it) {
                is HttpException -> {
                    ex = BaseException(ErrorType.NETWORK_ERROR, e)
                    return ex
                }
                is JsonParseException, is JSONException, is ParseException, is MalformedJsonException -> {
                    ex = BaseException(ErrorType.PARSE_ERROR, e)
                    return ex
                }
                is ConnectException -> {
                    ex = BaseException(ErrorType.NETWORK_ERROR, e)
                    return ex
                }
                is javax.net.ssl.SSLException -> {
                    ex = BaseException(ErrorType.SSL_ERROR, e)
                    return ex
                }
                is InterruptedIOException -> {
                    ex = BaseException(ErrorType.TIMEOUT_ERROR, e)
                    return ex
                }
                is java.net.SocketTimeoutException -> {
                    ex = BaseException(ErrorType.TIMEOUT_ERROR, e)
                    return ex
                }
                is java.net.UnknownHostException -> {
                    ex = BaseException(ErrorType.TIMEOUT_ERROR, e)
                    return ex
                }
                is BaseException -> return it

                else -> {
                    ex = BaseException(ErrorType.UNKNOWN, e)
                    return ex
                }
            }
        }
        ex = BaseException(ErrorType.UNKNOWN, e)
        return ex
    }
}