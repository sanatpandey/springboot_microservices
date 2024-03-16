package com.codingheaven.accounts.mapper

import com.codingheaven.accounts.dto.AccountsDto
import com.codingheaven.accounts.entity.Accounts

open class AccountsMapper {
    companion object{
        fun mapToAccountsDto(accounts: Accounts): AccountsDto{
            return AccountsDto(
                    accountNumber = accounts.accountNumber,
                    accountType = accounts.accountType,
                    branchAddress = accounts.branchAddress
            )
        }

        fun mapToAccounts(accountsDto: AccountsDto): Accounts{
            return Accounts(
                    accountNumber = accountsDto.accountNumber,
                    accountType = accountsDto.accountType,
                    branchAddress = accountsDto.branchAddress
            )
        }
    }
}