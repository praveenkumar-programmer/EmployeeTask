package com.geeks4ever.employeetask.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.geeks4ever.employeetask.R
import com.geeks4ever.employeetask.model.repository.EmployeeConvertorModel
import com.geeks4ever.employeetask.view.adapter.EmployeeAdaptor
import com.geeks4ever.employeetask.viewmodel.EmployeeViewModel
import kotlinx.android.synthetic.main.activity_main.*

class EmployeeList : AppCompatActivity() {

    val adapter = EmployeeAdaptor()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Employee List"


        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =  LinearLayoutManager(this)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.AndroidViewModelFactory(this.application)
        )[EmployeeViewModel::class.java]

        viewModel.getAllEmployees()

        viewModel.employeeList.observeForever {
            adapter.employees = it as MutableList<EmployeeConvertorModel>
            adapter.notifyDataSetChanged()
        }

    }
}