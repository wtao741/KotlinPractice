package com.wtao.usercenter.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.wtao.usercenter.R
import org.jetbrains.anko.toast

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        toast(""+intent.getIntExtra("id",0))
    }
}
