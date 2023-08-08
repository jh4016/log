package com.example.logsign

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val textViewName = findViewById<TextView>(R.id.textView)
        val textViewID = findViewById<TextView>(R.id.textView3)
        val buttonExit = findViewById<Button>(R.id.button)

        val getID = intent.getStringExtra("ID")
        val getName = intent.getStringExtra("name")
        textViewID.text  = "아이디: $getID"
        textViewName.text = "이름: $getName"

        buttonExit.setOnClickListener {
            finish()
        }
    }
}