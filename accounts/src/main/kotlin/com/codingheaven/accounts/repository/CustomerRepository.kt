package com.codingheaven.accounts.repository

import com.codingheaven.accounts.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface CustomerRepository: JpaRepository<Customer, Long> {
    fun findByMobileNumber(mobileNumber: String): Optional<Customer>
}