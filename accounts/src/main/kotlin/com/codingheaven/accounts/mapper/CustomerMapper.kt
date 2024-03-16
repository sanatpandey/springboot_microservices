package com.codingheaven.accounts.mapper

import com.codingheaven.accounts.dto.CustomerDto
import com.codingheaven.accounts.entity.Customer

class CustomerMapper {
    companion object{
        fun mapToCustomerDto(customer: Customer): CustomerDto{
            return CustomerDto(
                    name = customer.name,
                    email = customer.email,
                    mobileNumber = customer.mobileNumber
            )
        }

        fun mapToCustomer(customerDto: CustomerDto): Customer{
            return Customer(
                    name = customerDto.name,
                    email = customerDto.email,
                    mobileNumber = customerDto.mobileNumber
            )
        }
    }
}