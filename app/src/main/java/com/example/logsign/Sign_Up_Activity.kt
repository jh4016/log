package com.example.logsign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Sign_Up_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        val btn3 = findViewById<Button>(R.id.btn3) // 회원가입 버튼
        val Name = findViewById<EditText>(R.id.editTextText)
        val ID = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val Password = findViewById<EditText>(R.id.editTextNumberPassword)


        btn3.setOnClickListener {
            if (Name.text.isNotEmpty() && ID.text.isNotEmpty() && Password.text.isNotEmpty()) {
                val intent = Intent(this, SignInActivity::class.java)
                intent.putExtra("ID", ID.text.toString()) // Extra로 아이디 전달
                intent.putExtra("name", Name.text.toString()) // Extra로 Name 전달
                startActivity(intent)
                finish() // SignUpActivity 종료
            } else {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}