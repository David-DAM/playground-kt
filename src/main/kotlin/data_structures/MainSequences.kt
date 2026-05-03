package com.davinchicoder.data_structures

fun main() {

    val result = (1..1_000_000)
        .asSequence()
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .take(5)
        .toList()

    println(result)
}