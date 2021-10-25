package com.cif.graph.resolver

import com.cif.graph.domain.BankAccount
import com.cif.graph.domain.Currency
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component
import java.util.*

@Component
class BankAccountResolver: GraphQLQueryResolver {
    fun bankAccount(id: UUID): BankAccount {
        return BankAccount(id, "Phillip", Currency.CHF)
    }
}