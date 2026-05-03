package com.davinchicoder.regex

private const val securePassword = "StrongPass123!"

fun main() {
    val regex = Regex("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$")

    val matches = regex.matches(securePassword)
    
    println("Matches: $matches")
}