package com.codingheaven.accounts.dto

data class AccountsDto(
        var customerId: Long = 0,
        var accountNumber: Long,
        var accountType: String,
        var branchAddress: String
)
