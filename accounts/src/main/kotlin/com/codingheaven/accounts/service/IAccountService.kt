package com.codingheaven.accounts.service

import com.codingheaven.accounts.dto.CustomerDto

interface IAccountService {
    fun createAccount(customerDto: CustomerDto)
}