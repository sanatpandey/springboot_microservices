package com.codingheaven.accounts.entity

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
@Table(name = "Accounts")
data class Accounts(
        var customerId: Long = 0,
        @Id
        var accountNumber: Long,
        var accountType: String,
        var branchAddress: String): BaseEntity()
