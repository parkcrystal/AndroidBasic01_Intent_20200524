package com.phis.androidbasic01_intent_20200524

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        goBackBtn.setOnClickListener {
//            새로 MainActivity를 하나 더 만들어서 얹어줌.
//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

//            FirstActivity를 종료
            finish()
        }
    }
}
