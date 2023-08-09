package com.example.logsign

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val random = findViewById<ImageView>(R.id.imageView3)
        val textViewName = findViewById<TextView>(R.id.textView)
        val textViewID = findViewById<TextView>(R.id.textView3)
        val buttonExit = findViewById<Button>(R.id.button)

        val getID = intent.getStringExtra("ID")
        val getName = intent.getStringExtra("name")
        textViewID.text  = "아이디: $getID"
        textViewName.text = "이름: $getName"
//        when(Random.nextInt(1,6)) {
//            1 -> random.setImageResource(R.drawable.)
//            2 -> random.setImageResource(R.drawable.)
//            3 -> random.setImageResource(R.drawable.)
//            4 -> random.setImageResource(R.drawable.)
//            5 -> random.setImageResource(R.drawable.)
//        }//이미지넣기가 너무 귀찮아서...코드만 등록
        buttonExit.setOnClickListener {
            finish()
        }
    }
}