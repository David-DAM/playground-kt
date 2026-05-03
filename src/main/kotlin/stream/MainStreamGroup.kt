package com.davinchicoder.stream

fun main() {

    val numbers = listOf("apple", "banana", "cherry", "date", "elderberry")

    val result = numbers
        .groupBy { it.length }
        .mapValues { (_, words) ->
            words.joinToString(separator = " | ") { it.uppercase() }
        }
        .also { grouped ->
            grouped.forEach { (length, combined) ->
                println("Words with $length letters: $combined")
            }
        }
        .entries
        .associate { it.toPair() }
        .takeIf { it.isNotEmpty() }
        ?: emptyMap()

    println(result)

}