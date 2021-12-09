package com.example.unit1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ThirdTask : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_task)
    }

    fun clickToCount(view:View){
        counter++
        val textCounter = findViewById<TextView>(R.id.show_count2)
        textCounter.text = counter.toString()
    }

    fun onClick(view: View){
        val i = Intent()
        setResult(RESULT_OK, i)
        finish()
    }
    fun showToast(view:View){
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
    }

}