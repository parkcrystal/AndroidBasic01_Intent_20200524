package com.phis.androidbasic01_intent_20200524

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToFirstBtn.setOnClickListener {

            val myIntent =
                Intent(this, FirstActivity::class.java)
                startActivity(myIntent)


        }

//        두번째 액티비티로 버튼을 누르면 이동, 돌아가기 버튼 누르면 메인

        goToSecondBtn.setOnClickListener {

            val myIntent = Intent(this, SecondActivity::class.java)
            startActivity(myIntent)

        }

        goToThirdBtn.setOnClickListener {

            var inputContent = contentEdt.text.toString()


            val myIntent = Intent(this, ThirdActivity::class.java)
            myIntent.putExtra("content", inputContent)
            myIntent.putExtra("number", 10)

            startActivity(myIntent)

        }

        goToFourthBtn.setOnClickListener {

            var inputPhoneNum = phoneNumEdt.text.toString()


            val myIntent = Intent(this, FourthActivity::class.java)
            myIntent.putExtra("phone", inputPhoneNum)

            startActivity(myIntent)

        }
    }
}
