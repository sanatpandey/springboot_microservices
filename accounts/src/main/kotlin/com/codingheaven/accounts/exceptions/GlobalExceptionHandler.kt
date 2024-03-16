package com.codingheaven.accounts.exceptions

import com.codingheaven.accounts.dto.ErrorResponseDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import java.time.LocalDateTime

@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(CustomerAlreadyExistsException::class)
    fun handleCustomerAlreadyExistsException(
            exception: CustomerAlreadyExistsException,
            webRequest: WebRequest): ResponseEntity<ErrorResponseDto>{
        val errorResponseDto = exception.message?.let {
            ErrorResponseDto(
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                    it,
                LocalDateTime.now()
        )
        }
        return ResponseEntity(errorResponseDto, HttpStatus.BAD_REQUEST)
    }
}