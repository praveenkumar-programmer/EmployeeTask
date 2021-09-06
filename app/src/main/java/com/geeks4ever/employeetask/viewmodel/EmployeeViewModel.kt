package com.geeks4ever.employeetask.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.geeks4ever.employeetask.model.EmployeeDetailModel
import com.geeks4ever.employeetask.model.EmployeeModel
import com.geeks4ever.employeetask.model.repository.repositoty
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EmployeeViewModel(application: Application) : AndroidViewModel(application) {

    val employeeList = MutableLiveData<List<EmployeeModel>>()
    val employeeDetail = MutableLiveData<EmployeeDetailModel>()

    fun getAllEmployees() {
        val response = repositoty.getAllEmployees()
        response.enqueue(object : Callback<List<EmployeeModel>> {
            override fun onResponse(call: Call<List<EmployeeModel>>, response: Response<List<EmployeeModel>>) {
                employeeList.postValue(response.body())
            }
            override fun onFailure(call: Call<List<EmployeeModel>>, t: Throwable) {

            }
        })
    }

    fun getEmployeeDetails(id: Int) {
        val response = repositoty.getEmployeeDetails(id)
        response.enqueue(object : Callback<EmployeeDetailModel> {
            override fun onResponse(call: Call<EmployeeDetailModel>, response: Response<EmployeeDetailModel>) {
                employeeDetail.postValue(response.body())
            }

            override fun onFailure(call: Call<EmployeeDetailModel>, t: Throwable) {
            }
        })
    }

}