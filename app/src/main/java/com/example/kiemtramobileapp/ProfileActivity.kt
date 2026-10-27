package com.example.kiemtramobileapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_EMAIL = "EXTRA_EMAIL"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Cau 2 va 3: Anh xa giao dien bang findViewById
        val txtEmail = findViewById<TextView>(R.id.txtEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val listSubjects = findViewById<ListView>(R.id.listSubjects)

        // Cau 2: Nhan Email tu LoginActivity va dang xuat
        val email = intent.getStringExtra(EXTRA_EMAIL).orEmpty()
        txtEmail.text = email
        btnLogout.setOnClickListener { finish() }

        // Cau 3: Danh sach >= 5 mon hoc/ky nang
        val subjects = listOf(
            "Lập trình Kotlin",
            "Thiết kế Layout XML",
            "Quản lý Git/GitHub",
            "Xử lý Intent",
            "Kiến trúc Android"
        )

        // Cau 3: ArrayAdapter gan du lieu len ListView
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            subjects
        )
        listSubjects.adapter = adapter

        // Cau 3: Click phan tu nao thi Toast hien DUNG ten phan tu do
        listSubjects.setOnItemClickListener { _, _, position, _ ->
            Toast.makeText(this, subjects[position], Toast.LENGTH_SHORT).show()
        }
    }
}
