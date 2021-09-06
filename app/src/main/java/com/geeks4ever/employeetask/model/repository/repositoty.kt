package com.geeks4ever.employeetask.model.repository

import com.geeks4ever.employeetask.model.repository.retrofit.ApiInterface

object repositoty  {

    private val apiInterface = ApiInterface.create()

    fun getAllEmployees() = apiInterface.getEmployees()
    fun getEmployeeDetails(id: Int) = apiInterface.getEmployeeDetails(id)

}