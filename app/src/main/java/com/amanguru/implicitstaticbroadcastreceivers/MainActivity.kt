package com.amanguru.implicitstaticbroadcastreceivers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sendButton=findViewById(R.id.button) as Button
        val textview =findViewById(R.id.textView) as TextView
        sendButton.setOnClickListener{

        }
    }
}
