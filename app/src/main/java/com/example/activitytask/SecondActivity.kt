package com.example.activitytask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent=intent
        val message=intent.getStringExtra("key")
        second_tv.text=message
    }

    fun onClickResponseButton(view: View) {
        val intent= Intent(this,MainActivity::class.java)
        intent.putExtra("key2","No!Fuck You!")
        setResult(RESULT_OK,intent)
        finish()
    }
}