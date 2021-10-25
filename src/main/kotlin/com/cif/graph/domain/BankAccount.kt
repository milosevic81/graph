package com.cif.graph.domain

import java.util.*


data class BankAccount(
    val id: UUID,
    val name: String,
    val currency: Currency
)