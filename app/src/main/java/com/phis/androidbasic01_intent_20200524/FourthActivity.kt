package com.phis.androidbasic01_intent_20200524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_third.*

class FourthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)



        val phone = intent.getStringExtra("phone")

        phoneTxt.text = phone

    }
}
