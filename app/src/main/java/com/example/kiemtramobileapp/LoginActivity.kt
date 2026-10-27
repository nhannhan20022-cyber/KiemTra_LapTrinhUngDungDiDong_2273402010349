package com.example.kiemtramobileapp

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Cau 1: anh xa View bat buoc bang findViewById
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val txtStatus = findViewById<TextView>(R.id.txtStatus)

        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString()

            val errorMessage = when {
                email.isEmpty() && password.isEmpty() -> "Vui lòng nhập Email và Mật khẩu!"
                email.isEmpty() -> "Vui lòng nhập Email!"
                password.isEmpty() -> "Vui lòng nhập Mật khẩu!"
                !Patterns.EMAIL_ADDRESS.matcher(email).matches() -> "Email không đúng định dạng!"
                password.length < 6 -> "Mật khẩu phải có ít nhất 6 ký tự!"
                else -> null
            }

            if (errorMessage != null) {
                txtStatus.text = errorMessage
                txtStatus.setTextColor(ContextCompat.getColor(this, R.color.color_error))
            } else {
                txtStatus.text = "Xác thực thành công!"
                txtStatus.setTextColor(ContextCompat.getColor(this, R.color.color_success))
            }
        }
    }
}
