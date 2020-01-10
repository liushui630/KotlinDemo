package com.zhengjy.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhengjy.example.kotlindemo.base.LoopTest
import com.zhengjy.example.kotlindemo.base.StringTest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StringTest.test()
        LoopTest.test()
    }
}
