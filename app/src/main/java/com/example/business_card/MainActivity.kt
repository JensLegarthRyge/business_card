package com.example.business_card

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val companyInfoButton: Button = findViewById(R.id.companyInfoButton)
        val employeeInfoButton: Button = findViewById(R.id.employeeInfoButton)

        companyInfoButton.setOnClickListener {
            startActivity(Intent(this, CompanyInfoActivity::class.java))
        }

        employeeInfoButton.setOnClickListener {
            startActivity(Intent(this, EmployeeInfoActivity::class.java))
        }
    }
}