package com.davinchicoder.data_structures

fun main() {

    data class User(val name: String, val age: Int)

    val users = listOf(
        User("David", 25),
        User("Ana", 30),
        User("Luis", 25)
    )
    
    val grouped = users.groupBy { it.age }
    println("Grouped by age: $grouped")

    val mapByName = users.associateBy { it.name }
    println("Map by name: $mapByName")
}