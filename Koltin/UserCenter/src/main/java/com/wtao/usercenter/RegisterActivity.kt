package com.wtao.usercenter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        tvRegister.setOnClickListener {
            Toast.makeText(this,"注册",Toast.LENGTH_LONG).show()
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
}
