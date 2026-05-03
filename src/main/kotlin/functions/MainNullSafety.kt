package com.davinchicoder.functions

fun main() {
    val name1: String? = null

    val length = safeLength(name1)

    println(length)

    val name2: String? = "David"

    name2?.let {
        println(it.length)
    }
}

fun safeLength(name: String?): Int {
    return name?.length ?: 0
}