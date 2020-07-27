package com.example.demo_7_27

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            //新建一个页面

            //跳转界面
            startActivity(Intent(this,DetailActivity::class.java))


            println("被点击了") }

    }
}