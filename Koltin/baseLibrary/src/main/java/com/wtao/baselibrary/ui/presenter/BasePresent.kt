package com.wtao.baselibrary.ui.presenter

import com.wtao.baselibrary.ui.presenter.view.BaseView

/**
 * Created by wtao on 2018/6/8.
 */
open class BasePresent<T:BaseView> {

    lateinit var mView : T
}