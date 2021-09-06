package com.geeks4ever.employeetask.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks4ever.employeetask.R

class EmployeeDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_detail)


        supportActionBar?.title = "Employee Detail"

    }
}