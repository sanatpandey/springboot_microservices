package com.codingheaven.accounts.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
class CustomerAlreadyExistsException public constructor(message: String)
    : RuntimeException(message)