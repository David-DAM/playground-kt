package com.davinchicoder.data_structures

fun main() {

    val triple = Triple("A", "B", "C")
    println("Triple: $triple")

    val (first, second, third) = triple
    println("First: $first, Second: $second, Third: $third")

    println("Triple destructuring completed")
}