package com.example.models


import io.ktor.http.*
import kotlinx.serialization.Serializable

@Serializable
data class Customer(val id:String, val firstName:String, val lastName: String, val email:String)

val customerStorage = mutableListOf<Customer>()
