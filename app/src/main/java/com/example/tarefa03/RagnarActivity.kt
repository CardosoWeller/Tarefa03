package com.example.tarefa03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_ragnar.*

class RagnarActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState : Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ragnar)

        val info = intent.extras?.getString("info")

        Log.i("Info", "RagnarActivity.onCreate")

    }

    override fun onStart() {
        super.onStart()
        Log.i("Info", "RagnarActivity.onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("info", "RagnarActivity.onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Info", "RagnarActivity.onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Info", "RagnarActivity.onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Info", "RagnarActivity.onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Info", "RagnarActivity.onDestroy")
    }


}