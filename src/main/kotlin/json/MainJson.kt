package com.davinchicoder.json

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class User(val id: Int, val name: String)

fun main() {

    val json = """
        {
            "id":1,
            "name":"David"
        }
        """.trimIndent()

    val parsed = Json.decodeFromString<User>(json)

    println("Parsed: $parsed")

    val encoded = Json.encodeToString(User(2, "Ana"))
    println("Encoded: $encoded")
}