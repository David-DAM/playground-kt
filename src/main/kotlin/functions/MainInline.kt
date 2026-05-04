package com.davinchicoder.functions

fun main() {

    data class Person(var name: String, var age: Int)

    val user = Person("", 0).apply {
        name = "David"
        age = 30
    }

    val nameLength = user.let { it.name.length }

    nameLength.also { println(it) }

    val upperCaseName = user.run { name.uppercase() }

    with(user) {
        println(name)
        println(age)
    }

    val measureTime = measureTime {
        "Hello World"
    }
    println("Execution time: ${measureTime.second} ms for result: ${measureTime.first}")
}

inline fun <reified T> measureTime(block: () -> T): Pair<T, Long> {
    val startTime = System.currentTimeMillis()
    val result = block()
    val endTime = System.currentTimeMillis()
    return Pair(result, endTime - startTime)
}