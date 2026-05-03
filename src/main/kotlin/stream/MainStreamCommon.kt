package com.davinchicoder.stream

fun main() {

    val result = listOf(1, 2, 3, 4, 5)
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .toList()

    println(result)

}