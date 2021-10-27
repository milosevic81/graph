package com.cif.graph.resolver

import com.cif.graph.domain.BankAccount
import com.cif.graph.domain.Client
import com.cif.graph.domain.Currency
import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.coxautodev.graphql.tools.GraphQLResolver
import org.springframework.stereotype.Component
import java.util.*

@Component
class ClientResolver: GraphQLResolver<BankAccount> {
    fun client(bankAccount: BankAccount): Client {
        return Client(bankAccount.id, "Jane", "Doe")
    }
}