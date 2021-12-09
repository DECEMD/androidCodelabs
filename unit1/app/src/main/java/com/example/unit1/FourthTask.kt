package com.example.unit1

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class FourthTask : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_task)
    }

    fun onClick(view: View){
        val i = Intent()
        setResult(RESULT_OK, i)
        finish()
    }

}