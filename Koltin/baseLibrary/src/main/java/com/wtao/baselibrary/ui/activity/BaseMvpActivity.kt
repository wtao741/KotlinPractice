package com.wtao.baselibrary.ui.activity

import com.wtao.baselibrary.ui.presenter.BasePresent
import com.wtao.baselibrary.ui.presenter.view.BaseView

/**
 * Created by wtao on 2018/6/8.
 */
open class BaseMvpActivity<T : BasePresent<*>> : BaseActivity(),BaseView {
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError() {
    }

    lateinit var mPresenter : T
}