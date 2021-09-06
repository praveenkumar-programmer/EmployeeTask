package com.geeks4ever.employeetask.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks4ever.employeetask.R

class EmployeeList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportActionBar?.title = "Employee List"

    }
}