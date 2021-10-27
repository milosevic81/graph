package com.cif.graph.domain

import java.util.*


data class BankAccount(
    val id: UUID,
    val currency: Currency,
    var client: Client?
)