package com.codingheaven.accounts.entity

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import lombok.Getter
import lombok.Setter
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.Instant

@MappedSuperclass
@Getter @Setter
abstract class BaseEntity {
    @Column(updatable = false)
    @field:CreationTimestamp
    val createdAt: Instant? = null

    @Column(updatable = false)
    @field:UpdateTimestamp
    val updatedAt: Instant? = null

    @Column(updatable = false)
    val createdBy: String? = null
    @Column(updatable = false)
    val updatedBy: String? = null
}