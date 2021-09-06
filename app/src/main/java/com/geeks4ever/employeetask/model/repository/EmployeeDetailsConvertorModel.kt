package com.geeks4ever.employeetask.model.repository

import com.google.gson.annotations.SerializedName

data class EmployeeDetailsConvertorModel(

    @SerializedName("id")
    var employeeId: Int?,

    @SerializedName("name")
    var name: String?,

    @SerializedName("email")
    var email: String?,

    @SerializedName("address")
    var address: EmployeeAddressConvertorModel,

    @SerializedName("phone")
    var phone: String?,

    @SerializedName("company")
    var companyName: EmployeeCompanyConvertorModel,

    @SerializedName("website")
    var companyWebsite: String?,



    )
