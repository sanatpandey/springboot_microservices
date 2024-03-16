package com.codingheaven.accounts.entity

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
@Table(name = "Customer")
data class Customer(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
        @GenericGenerator(name = "native", strategy = "native")
        var customerId: Long = 0,
        var name: String,
        var email: String,
        var mobileNumber: String): BaseEntity()