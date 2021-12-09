package com.example.unit1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SeventhTask : AppCompatActivity() {
    private val LOG_TAG: String = SecondActivity::class.java.getSimpleName()
    lateinit var mMessageEditText: EditText
    lateinit var mReplyHeadTextView: TextView
    lateinit var mReplyTextView: TextView
    var mReply = "a"
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh_task)
        Log.d("Log1", "-------");
        Log.d("Log1", "onCreate")

        mMessageEditText = findViewById(R.id.editText_main1);
        mReplyHeadTextView = findViewById(R.id.text_header_reply);
        mReplyTextView = findViewById(R.id.text_message_reply);
    }

    override fun onStart() {
        super.onStart()
        Log.d("Log1", "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Log1", "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Log1", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Log1", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Log1", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Log1", "onDestroy")
    }

    fun onClick(view: View){
        val i = Intent()
        setResult(RESULT_OK, i)
        finish()
    }

    fun returnReply(view: View?) {
        val reply: String = mReply.toString()
        val replyIntent = Intent()
        replyIntent.putExtra("EXTRA_REPLY", reply)
        setResult(RESULT_OK, replyIntent)
        Log.d(LOG_TAG, "End SecondActivity")
        finish()
    }



}