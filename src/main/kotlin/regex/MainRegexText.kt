package com.davinchicoder.regex

fun main() {
    val regex = Regex("[a-z]+")

    val matches = regex.findAll("Hello, world! This is a test.")
        .map { it.value }
        .toList()

    println("Matches: $matches")

    val count = matches.size
    println("Number of matches: $count")

    if (count > 0) {
        println("First match: ${matches.first()}")
    }
}