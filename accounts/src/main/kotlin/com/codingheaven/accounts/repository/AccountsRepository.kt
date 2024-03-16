package com.codingheaven.accounts.repository

import com.codingheaven.accounts.entity.Accounts
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountsRepository: JpaRepository<Accounts, Long> {
}