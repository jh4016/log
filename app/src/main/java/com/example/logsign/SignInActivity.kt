package com.example.logsign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.logsign.R
import com.example.logsign.Sign_Up_Activity
import org.w3c.dom.Text

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn2 = findViewById<Button>(R.id.btn2)//회원가입
        val btn1 = findViewById<Button>(R.id.btn1)//로그인
        val id = findViewById<EditText>(R.id.ID_1)
        val password = findViewById<EditText>(R.id.pas_1)
        val get_id=intent.getStringExtra("ID")
        val get_name=intent.getStringExtra("name")
        btn2.setOnClickListener {//회원가입
            val intent = Intent(this, Sign_Up_Activity::class.java)
            startActivity(intent)
        }
        btn1.setOnClickListener {//로그인
            if (id.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("ID", get_id.toString()) // Extra로 아이디 전달
                intent.putExtra("name", get_name.toString()) // Extra로 Name 전달
                startActivity(intent)
                Toast.makeText(this, "로그인 되었습니다", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "아이디 비밀번호를 확인해주세요", Toast.LENGTH_SHORT).show()
            }
        }
    }
}



