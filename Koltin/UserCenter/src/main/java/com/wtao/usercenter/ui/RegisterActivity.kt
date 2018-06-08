package com.wtao.usercenter.ui

import android.os.Bundle
import com.wtao.baselibrary.ui.activity.BaseMvpActivity
import com.wtao.usercenter.R
import com.wtao.usercenter.ui.present.RegisterPresent
import com.wtao.usercenter.ui.present.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.*

class RegisterActivity : BaseMvpActivity<RegisterPresent>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresent();
        mPresenter.mView = this;

        tvRegister.setOnClickListener {
            //Toast.makeText(this,"注册",Toast.LENGTH_LONG).show()
            mPresenter.register(""+111,111)
        }

        btToast.setOnClickListener {
            alert("Hi, I'm Roy", "Have you tried turning it off and on again?") {
                yesButton { toast("Oh…") }
                noButton {}
            }.show()
        }

        btJump.setOnClickListener {
            //startActivity(intentFor<TestActivity>("id" to 5))
            startActivity<TestActivity>("id" to 10)
        }
    }

    override fun registerResult(result: Boolean) {
        toast(""+result)
    }

}
