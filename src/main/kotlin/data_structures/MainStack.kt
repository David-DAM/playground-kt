package com.davinchicoder.data_structures

import java.util.*

fun main() {

    val stack = ArrayDeque<Int>()

    stack.addLast(1)
    stack.addLast(2)
    stack.addLast(3)

    println("Stack: $stack")
    println("Popped element: ${stack.removeLast()}")
}