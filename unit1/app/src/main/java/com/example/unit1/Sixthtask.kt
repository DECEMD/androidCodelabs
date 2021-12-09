package com.example.unit1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.unit1.databinding.ActivitySixthtaskBinding

class Sixthtask : AppCompatActivity() {
    lateinit var binding: ActivitySixthtaskBinding
    lateinit var editToSecondAct: EditText
    lateinit var txtMessageFromSecond: TextView
    private var launcher: ActivityResultLauncher<Intent>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySixthtaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        editToSecondAct = findViewById(R.id.editText_main)
        txtMessageFromSecond = findViewById(R.id.text_message)

        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                val text = result.data?.getStringExtra("reply")
                txtMessageFromSecond.text = "$text"
            }
        }


    }

    fun onClick(view: View){
        val i = Intent()
        setResult(RESULT_OK, i)
        finish()
    }



    fun launchSecondActivity(view: View) {
        Log.d("Log1", "Button clicked!");
        launcher?.launch(Intent(this, SixSecondActivity::class.java)
            .putExtra("text", editToSecondAct.text.toString()))


    }

}