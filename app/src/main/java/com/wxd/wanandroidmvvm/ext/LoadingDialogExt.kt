package com.wxd.wanandroidmvvm.ext

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.wxd.wanandroidmvvm.widget.LoadingDialog


/**
 * @author : wxd
 * @date : 2020/6/28
 */

//loading框
private var loadingDialog: LoadingDialog? = null

/**
 * 打开等待框
 */
fun AppCompatActivity.showLoadingExt(message: String = "请求网络中") {
    if (!this.isFinishing) {
        if (loadingDialog == null) {
            loadingDialog = LoadingDialog.Builder(this)
                .setMessage(message)
                .setShowMessage(true)
                .setCancelOutside(true)
                .setCancelable(true)
                .create()
        }
        loadingDialog?.show()
    }
}

/**
 * 打开等待框
 */
fun Fragment.showLoadingExt(message: String = "请求网络中") {
    activity?.let {
        if (!it.isFinishing) {
            if (loadingDialog == null) {
                loadingDialog = LoadingDialog.Builder(it)
                    .setMessage(message)
                    .setShowMessage(true)
                    .setCancelOutside(true)
                    .setCancelable(true)
                    .create()
            }
            loadingDialog?.show()
        }
    }
}

/**
 * 关闭等待框
 */
fun Activity.dismissLoadingExt() {
    loadingDialog?.dismiss()
    loadingDialog = null
}

/**
 * 关闭等待框
 */
fun Fragment.dismissLoadingExt() {
    loadingDialog?.dismiss()
    loadingDialog = null
}
