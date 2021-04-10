package com.example.tarefa03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var info: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState != null){
            this.info = savedInstanceState.getString("info", "")
        }else {
            this.info = ""
        }
        //txtRestore.text = this.info

        Log.i("Info" , "MainActivity.onCreate")

        btRagnar.setOnClickListener{
            val info = "Ragnar criado"

            val bundle = Bundle()
            bundle.putString("info", info)

            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("Info", "MainActivity.onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("info", "MainActivity.onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Info", "MainActivity.onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Info", "MainActivity.onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Info", "MainActivity.onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Info", "MainActivity.onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("Info", "MainActivity.onSaveInstanceState")

        outState.putString("info", this.info)
    }

}
