package com.codingheaven.accounts.controller

import com.codingheaven.accounts.constants.AccountConstants
import com.codingheaven.accounts.dto.CustomerDto
import com.codingheaven.accounts.dto.ResponseDto
import com.codingheaven.accounts.service.IAccountService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/api"], produces = [MediaType.APPLICATION_JSON_VALUE])
open class AccountsController(val accountService: IAccountService) {
    public fun createAccount(@RequestBody customerDto: CustomerDto): ResponseEntity<ResponseDto>{
        accountService.createAccount(customerDto)
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(ResponseDto(AccountConstants.STATUS_201, AccountConstants.MESSAGE_201))
    }
}