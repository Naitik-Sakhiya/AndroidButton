package com.naitiks.androidbutton

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivityKt : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText1 = findViewById(R.id.edit_txt_1) as EditText
        val editText2 = findViewById(R.id.edit_txt_2) as EditText
        val btnAdd = findViewById(R.id.btn_add) as Button
        btnAdd.setOnClickListener {
            val ans = addTwoValues(editText1.text.toString(), editText2.text.toString())
            Toast.makeText(this@MainActivityKt, ans, Toast.LENGTH_SHORT).show()
        }
    }

    private fun addTwoValues(val1: String, val2: String): Int {
        return Integer.parseInt(val1) + Integer.parseInt(val2)
    }
}
