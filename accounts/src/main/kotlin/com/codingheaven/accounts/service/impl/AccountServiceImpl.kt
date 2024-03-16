package com.codingheaven.accounts.service.impl

import com.codingheaven.accounts.constants.AccountConstants
import com.codingheaven.accounts.dto.CustomerDto
import com.codingheaven.accounts.entity.Accounts
import com.codingheaven.accounts.entity.Customer
import com.codingheaven.accounts.exceptions.CustomerAlreadyExistsException
import com.codingheaven.accounts.mapper.CustomerMapper
import com.codingheaven.accounts.repository.AccountsRepository
import com.codingheaven.accounts.repository.CustomerRepository
import com.codingheaven.accounts.service.IAccountService
import lombok.AllArgsConstructor
import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
@AllArgsConstructor
open class AccountServiceImpl(
        val accountsRepository: AccountsRepository,
        val customerRepository: CustomerRepository
): IAccountService{

    override fun createAccount(customerDto: CustomerDto) {
        val customer = CustomerMapper.mapToCustomer(customerDto)
        val optionalCustomer = customerRepository.findByMobileNumber(customerDto.mobileNumber)
        if(optionalCustomer.isPresent){
            throw CustomerAlreadyExistsException("Customer already regustered with " +
                    "this mobile number="+customerDto.mobileNumber)
        }
        val savedCustomer = customerRepository.save(customer)
        accountsRepository.save(createNewAccount(savedCustomer))
    }

    fun createNewAccount(customer: Customer): Accounts{
        val randomAccountNumer: Long = 1000000000L + Random.nextInt(900000000)
        return Accounts(
                customerId = customer.customerId,
                accountNumber = randomAccountNumer,
                accountType = AccountConstants.SAVINGS,
                branchAddress = AccountConstants.ADDRESS
        )
    }
}