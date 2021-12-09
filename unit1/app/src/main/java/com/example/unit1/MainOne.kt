package com.example.unit1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.example.unit1.databinding.ActivityMainOneBinding

class MainOne : AppCompatActivity() {
    lateinit var binding: ActivityMainOneBinding
    private var launcher: ActivityResultLauncher<Intent>? = null
    private var launcher1: ActivityResultLauncher<Intent>? = null
    private var launcher2: ActivityResultLauncher<Intent>? = null
    private var launcher3: ActivityResultLauncher<Intent>? = null
    private var launcher4: ActivityResultLauncher<Intent>? = null
    private var launcher5: ActivityResultLauncher<Intent>? = null
    private var launcher6: ActivityResultLauncher<Intent>? = null
    private var launcher7: ActivityResultLauncher<Intent>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainOneBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                result.data
                Log.d("Log1", "Result from MainOne")
            }
        }

        launcher1 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                result.data
            }
        }

        launcher2 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                result.data
            }
        }

        launcher3 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                result.data
            }
        }

        launcher4 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                result.data
            }
        }

        launcher5 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                result.data
            }
        }

        launcher6 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                result.data
            }
        }

        launcher7 = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result: ActivityResult ->
            if(result.resultCode == RESULT_OK){
                result.data
            }
        }

    }


    fun onClick(view: View){
        launcher?.launch(Intent(this, MainActivity::class.java))
    }

    fun onClick1(view: View){
        launcher1?.launch(Intent(this, SecondTask::class.java))
    }

    fun onClick2(view: View){
        launcher1?.launch(Intent(this, ThirdTask::class.java))
    }

    fun onClick3(view: View){
        launcher1?.launch(Intent(this, FourthTask::class.java))
    }

    fun onClick4(view: View){
        launcher1?.launch(Intent(this, FifthTask::class.java))
    }

    fun onClick5(view: View){
        launcher1?.launch(Intent(this, Sixthtask::class.java))
    }

    fun onClick6(view: View){
        launcher1?.launch(Intent(this, SeventhTask::class.java))
    }

    fun onClick7(view: View){
        launcher1?.launch(Intent(this, EightTask::class.java))
    }


}