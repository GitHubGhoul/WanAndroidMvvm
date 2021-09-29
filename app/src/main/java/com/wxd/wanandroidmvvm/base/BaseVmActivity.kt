package com.wxd.wanandroidmvvm.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.wxd.wanandroidmvvm.ext.dismissLoadingExt
import com.wxd.wanandroidmvvm.ext.getVmClazz
import com.wxd.wanandroidmvvm.ext.showLoadingExt
import com.wxd.wanandroidmvvm.http.manage.NetworkStateManager

/**
 * @Author: wxd
 * @CreateDate: 2021/9/27 11:54
 * @Description: BaseVMActivity
 */
abstract class BaseVmActivity<VM : BaseViewModel> : AppCompatActivity() {

    private var isUserDb = false

    lateinit var mViewModel: VM

    abstract fun layoutId(): Int

    abstract fun initView(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!isUserDb) {
            setContentView(layoutId())
        } else {
            initDataBind()
        }
        init(savedInstanceState)
    }

    private fun init(savedInstanceState: Bundle?) {
        mViewModel = createViewModel()
        registerUIChange()
        initView(savedInstanceState)
        createObserver()
        NetworkStateManager.instance.mNetworkStateCallback.observe(this, {
            onNetworkStateChanged(it)
        })
    }

    /**
     * 网络变化监听 子类重写
     */
    open fun onNetworkStateChanged(isSuccess: Boolean) {}

    /**
     * 创建viewModel
     */
    private fun createViewModel(): VM {
        return ViewModelProvider(this).get(getVmClazz(this))
    }

    /**
     * 创建LiveData数据观察者
     */
    open fun createObserver() {

    }

    /**
     * 注册UI事件
     */
    private fun registerUIChange() {
        //显示弹窗
        mViewModel.loadingChange.showDialog.observe(this, {
            showLoadingExt(it)
        })
        //关闭弹窗
        mViewModel.loadingChange.dismissDialog.observe(this, {
            dismissLoadingExt()
        })
    }

    /**
     * 将非该Activity绑定的ViewModel添加 loading回调 防止出现请求时不显示 loading 弹窗bug
     */
    protected fun addLoadingObserve(vararg viewModels: BaseViewModel) {
        viewModels.forEach { viewModel ->
            //显示弹窗
            viewModel.loadingChange.showDialog.observe(this, {
                showLoadingExt(it)
            })
            //关闭弹窗
            viewModel.loadingChange.dismissDialog.observe(this, {
                dismissLoadingExt()
            })
        }
    }

    fun userDataBinding(isUserDb: Boolean) {
        this.isUserDb = isUserDb
    }

    /**
     * 供子类BaseVmDbActivity 初始化DataBinding操作
     */
    open fun initDataBind() {

    }
}