package com.shaj.t3ch.messagesharekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


     btn_show_toast.setOnClickListener {

         Log.i("MainActivity","Show Button Clicked!")
         Toast.makeText(this,"Button Clicked",Toast.LENGTH_LONG).show()



     }



    }
}
