package com.example.unit1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SixSecondActivity : AppCompatActivity() {
    //var tvResult = findViewById<TextView>(R.id.text_message).toString()
    lateinit var gotTextFromFirst : TextView
    lateinit var replyToFirstEd: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_six_second)


        gotTextFromFirst = findViewById(R.id.text_message)
        replyToFirstEd = findViewById(R.id.editText_second)


        val replyText = intent.getStringExtra("text")
        gotTextFromFirst.text = "$replyText"


    }



    fun onClickSix(view: View){
        val i = Intent(this, Sixthtask::class.java)
            .putExtra("reply", replyToFirstEd.text.toString())
        setResult(RESULT_OK, i)
        finish()

    }

}