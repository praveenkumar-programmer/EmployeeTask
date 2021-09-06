package com.geeks4ever.employeetask.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.geeks4ever.employeetask.R
import com.geeks4ever.employeetask.viewmodel.EmployeeViewModel

class EmployeeDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_detail)

        supportActionBar?.title = "Employee Detail"

        var viewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory(this.application)
        )[EmployeeViewModel::class.java]

    }
}