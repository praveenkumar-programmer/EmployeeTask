package com.geeks4ever.employeetask.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.geeks4ever.employeetask.R
import com.geeks4ever.employeetask.viewmodel.EmployeeViewModel
import kotlinx.android.synthetic.main.activity_employee_detail.*

class EmployeeDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_detail)

        supportActionBar?.title = "Employee Detail"

        var id = 1
        id = intent.extras?.get("id") as Int

        var viewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory(this.application)
        )[EmployeeViewModel::class.java]

        viewModel.getEmployeeDetails(id)

        viewModel.employeeDetail.observeForever{

            employeeDetailPageId.text = "Employee Id: " + it.employeeId.toString()
            employeeDetailPageName.text = "Name: " + it.name.toString()
            employeeDetailPageEmail.text = "Email: " + it.email.toString()
            employeeDetailPageAddress.text = "Address: " + it.address .toString()
            employeeDetailPagePhone.text = "Phone Number " + it.phone.toString()
            employeeDetailCompanyName.text = "Company Name: " + it.companyName.toString()
            employeeDetailPageCompanyWebsite.text = "Website: " + it.companyWebsite.toString()


        }

    }
}