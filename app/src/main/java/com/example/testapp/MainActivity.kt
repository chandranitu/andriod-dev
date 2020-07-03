package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.testapp.R.layout.activity_main

public class MainActivity : AppCompatActivity() {

        fun clickButton(v: View){
        val mToast = Toast.makeText(applicationContext,"button clicked", Toast.LENGTH_SHORT)
        mToast.show()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)
    }
}