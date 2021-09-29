package com.wxd.wanandroidmvvm.widget

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import com.wxd.wanandroidmvvm.R

class LoadingDialog(context: Context, customDialog: Int) : Dialog(context, customDialog) {

    class Builder(private val context: Context) {
        private var message: String? = null
        private var isShowMessage = false
        private var isCancelable = true
        private var isCancelOutside = false

        /**
         * 设置提示信息
         *
         * @param message
         * @return
         */
        fun setMessage(message: String?): Builder {
            this.message = message
            return this
        }

        /**
         * 设置是否显示提示信息
         *
         * @param isShowMessage
         * @return
         */
        fun setShowMessage(isShowMessage: Boolean): Builder {
            this.isShowMessage = isShowMessage
            return this
        }

        /**
         * 设置是否可以按返回键取消
         *
         * @param isCancelable
         * @return
         */
        fun setCancelable(isCancelable: Boolean): Builder {
            this.isCancelable = isCancelable
            return this
        }

        /**
         * 设置是否可以取消
         *
         * @param isCancelOutside
         * @return
         */
        fun setCancelOutside(isCancelOutside: Boolean): Builder {
            this.isCancelOutside = isCancelOutside
            return this
        }

        fun create(): LoadingDialog {
            val inflater = LayoutInflater.from(context)
            val view: View = inflater.inflate(R.layout.dialog_loading, null)
            val loadingDialog = LoadingDialog(context, R.style.LoadingDialog)
            val msgText = view.findViewById(R.id.loading_tips) as TextView
            if (isShowMessage) {
                msgText.text = message
            } else {
                msgText.visibility = View.GONE
            }
            loadingDialog.setContentView(view)
            loadingDialog.setCancelable(isCancelable)
            loadingDialog.setCanceledOnTouchOutside(isCancelOutside)
            return loadingDialog
        }
    }

}