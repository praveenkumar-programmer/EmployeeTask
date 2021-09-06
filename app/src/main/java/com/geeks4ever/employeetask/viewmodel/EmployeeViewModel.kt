package com.geeks4ever.employeetask.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.geeks4ever.employeetask.model.repository.EmployeeConvertorModel
import com.geeks4ever.employeetask.model.repository.EmployeeDetailsConvertorModel
import com.geeks4ever.employeetask.model.repository.repositoty
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class EmployeeViewModel(application: Application) : AndroidViewModel(application) {

    val employeeList = MutableLiveData<List<EmployeeConvertorModel>>()
    val employeeDetail = MutableLiveData<EmployeeDetailsConvertorModel>()

    fun getAllEmployees() {
        val response = repositoty.getAllEmployees()
        response.enqueue(object : Callback<List<EmployeeConvertorModel>> {
            override fun onResponse(call: Call<List<EmployeeConvertorModel>>, response: Response<List<EmployeeConvertorModel>>) {
                employeeList.postValue(response.body())
            }
            override fun onFailure(call: Call<List<EmployeeConvertorModel>>, t: Throwable) {

            }
        })
    }

    fun getEmployeeDetails(id: Int) {
        val response = repositoty.getEmployeeDetails(id)
        response.enqueue(object : Callback<EmployeeDetailsConvertorModel> {
            override fun onResponse(call: Call<EmployeeDetailsConvertorModel>, response: Response<EmployeeDetailsConvertorModel>) {
                employeeDetail.postValue(response.body())
            }

            override fun onFailure(call: Call<EmployeeDetailsConvertorModel>, t: Throwable) {
            }
        })
    }

}