package com.shaj.t3ch.messagesharekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle: Bundle? = intent.extras
        val msg = bundle!!.getString("message")

        tv.text = msg

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()


    }
}
