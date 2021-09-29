package com.wxd.wanandroidmvvm.base

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import com.wxd.wanandroidmvvm.ext.dismissLoadingExt
import com.wxd.wanandroidmvvm.ext.getVmClazz
import com.wxd.wanandroidmvvm.ext.showLoadingExt
import com.wxd.wanandroidmvvm.http.manage.NetworkStateManager

/**
 * @Author: wxd
 * @CreateDate: 2021/9/27 17:01
 * @Description: BaseVmFragment
 */
abstract class BaseVmFragment<VM : BaseViewModel> : Fragment() {

    private val handler = Handler(Looper.getMainLooper())

    //是否第一次加载
    private var isFirst: Boolean = false

    lateinit var mViewModel: VM

    lateinit var mActivity: AppCompatActivity

    abstract fun layoutId(): Int

    abstract fun initView(savedInstanceState: Bundle?)

    open fun initData() {}

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId(), container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mActivity = context as AppCompatActivity
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        isFirst = true
        mViewModel = createViewModel()
        initView(savedInstanceState)
        createObserver()
        registerDefUIChange()
        initData()
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
     * 懒加载
     */
    open fun lazyLoadData() {}

    /**
     * 创建观察者
     */
    open fun createObserver() {}

    override fun onResume() {
        super.onResume()
        onVisible()
    }

    private fun onVisible() {
        if (lifecycle.currentState == Lifecycle.State.STARTED && isFirst) {
            // 延迟加载 防止 切换动画还没执行完毕时数据就已经加载好了，这时页面会有渲染卡顿
            handler.postDelayed({
                lazyLoadData()
                //在Fragment中，只有懒加载过了才能开启网络变化监听
                NetworkStateManager.instance.mNetworkStateCallback.observe(this, {
                    if (!isFirst) {
                        onNetworkStateChanged(it)
                    }
                })
            }, lazyLoadTime())
        }
    }

    /**
     * 注册UI事件
     */
    private fun registerDefUIChange() {
        mViewModel.loadingChange.showDialog.observe(this, {
            showLoadingExt(it)
        })
        mViewModel.loadingChange.dismissDialog.observe(this, {
            dismissLoadingExt()
        })
    }

    /**
     *  将非该Fragment绑定的ViewModel添加 loading回调 防止出现请求时不显示 loading 弹窗bug
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

    /**
     * 延迟加载 防止 切换动画还没执行完毕时数据就已经加载好了，这时页面会有渲染卡顿  bug
     * 这里传入你想要延迟的时间，延迟时间可以设置比转场动画时间长一点 单位： 毫秒
     * 不传默认 300毫秒
     */
    open fun lazyLoadTime(): Long {
        return 300
    }

    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacksAndMessages(null)
    }

}