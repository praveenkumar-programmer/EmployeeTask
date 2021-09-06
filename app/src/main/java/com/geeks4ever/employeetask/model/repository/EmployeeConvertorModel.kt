package com.geeks4ever.employeetask.model.repository

import com.google.gson.annotations.SerializedName

data class EmployeeConvertorModel(


    @SerializedName("id")
    var id: Int?,

    @SerializedName("name")
    var name: String?,

    @SerializedName("email")
    var email: String?,



)
