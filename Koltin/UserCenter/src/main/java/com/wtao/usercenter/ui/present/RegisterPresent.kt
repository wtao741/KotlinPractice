package com.wtao.usercenter.ui.present

import com.wtao.baselibrary.ui.presenter.BasePresent
import com.wtao.usercenter.ui.present.view.RegisterView

/**
 * Created by wtao on 2018/6/8.
 */
class RegisterPresent : BasePresent<RegisterView>() {

    fun register(mobile :String, code : Int){
        mView.registerResult(true)
    }
}