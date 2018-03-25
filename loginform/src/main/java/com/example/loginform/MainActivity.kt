package com.example.loginform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check.setOnClickListener {
            var id = enph.text.toString()
            var pass = enpass.text.toString()
            if(id == pass)
                textView3.setText("Correct")
            else
                textView3.setText("Fail!!!")
        }
    }
}
