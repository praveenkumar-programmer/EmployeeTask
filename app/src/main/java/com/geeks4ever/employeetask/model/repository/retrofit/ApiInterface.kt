package com.geeks4ever.employeetask.model.repository.retrofit

import com.geeks4ever.employeetask.model.EmployeeDetailModel
import com.geeks4ever.employeetask.model.EmployeeModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiInterface {

    companion object {

        private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

        fun create() : ApiInterface {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(ApiInterface::class.java)

        }

    }

    @GET("users")
    fun getEmployees(): Call<List<EmployeeModel>>

    @GET("users/{id}")
    fun getEmployeeDetails(@Path("id") id: Int?): Call<EmployeeDetailModel>



}