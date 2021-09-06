package com.geeks4ever.employeetask.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.geeks4ever.employeetask.R
import com.geeks4ever.employeetask.model.EmployeeModel
import com.google.android.material.textview.MaterialTextView

class EmployeeAdaptor: RecyclerView.Adapter<EmployeeViewHolder>() {

    var employees = mutableListOf<EmployeeModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return EmployeeViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val employee: EmployeeModel = employees[position]
        holder.bind(employee)
    }

    override fun getItemCount(): Int = employees.size
}

class EmployeeViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.single_employee_item, parent, false)) {
    private var employeeName: MaterialTextView? = null
    private var employeeEmail: MaterialTextView? = null


    init {
        employeeName = itemView.findViewById(R.id.employeeName)
        employeeEmail = itemView.findViewById(R.id.employeeEmail)
    }

    fun bind(employee : EmployeeModel) {
        employeeName?.text = employee.name
        employeeEmail?.text = employee.email
    }

}