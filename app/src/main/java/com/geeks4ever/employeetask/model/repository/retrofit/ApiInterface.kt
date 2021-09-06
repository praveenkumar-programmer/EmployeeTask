package com.geeks4ever.employeetask.model.repository.retrofit

import com.geeks4ever.employeetask.model.EmployeeDetailModel
import com.geeks4ever.employeetask.model.EmployeeModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }

    @GET("users")
    fun getEmployees(): Call<EmployeeModel>

    @GET("users/{id}")
    fun getEmployeeDetails(@Path("id") id: Int?): Call<EmployeeDetailModel>



}