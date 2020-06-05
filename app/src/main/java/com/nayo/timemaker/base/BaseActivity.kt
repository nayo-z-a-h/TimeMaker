package com.nayo.timemaker.base


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nayo.timemaker.R

 class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView()

    }

    fun setLayout(layoutId: Int): Int {

        return  layoutId
    }
}