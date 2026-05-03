package com.davinchicoder.stream

fun main() {

    val result = listOf(1, 2, 3, 4, 5)
        .partition { it % 2 == 0 }
        .let { (even, odd) ->
            even.sumOf { it * it } to odd.fold(1) { acc, n -> acc * n }
        }
        .also { (evenSquaresSum, oddProduct) ->
            println("Addition of the square evens: $evenSquaresSum")
            println("Product of odds: $oddProduct")
        }

    println(result)

}