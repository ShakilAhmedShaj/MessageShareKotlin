package com.shaj.t3ch.messagesharekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        

        btn_next.setOnClickListener {

            val message: String = et_message.text.toString()

//            Toast.makeText(this, message, Toast.LENGTH_LONG).show()

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("message",message)
            startActivity(intent)
        }

        btn_share.setOnClickListener {

            val message: String = et_message.text.toString()

            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,message)
            intent.type="text/plain"

            startActivity(Intent.createChooser(intent,"Share to"))




        }


    }
}
