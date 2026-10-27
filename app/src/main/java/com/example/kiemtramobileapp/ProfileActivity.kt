package com.example.kiemtramobileapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_EMAIL = "EXTRA_EMAIL"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Cau 2: bat buoc findViewById
        val txtEmail = findViewById<TextView>(R.id.txtEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // Lay Email da truyen tu LoginActivity bang putExtra
        val email = intent.getStringExtra(EXTRA_EMAIL).orEmpty()
        txtEmail.text = email

        // Dong ProfileActivity, quay ve LoginActivity
        btnLogout.setOnClickListener { finish() }
    }
}
