package com.codingheaven.accounts.dto

data class CustomerDto(
        var customerId: Long = 0,
        var name: String,
        var email: String,
        var mobileNumber: String
)
