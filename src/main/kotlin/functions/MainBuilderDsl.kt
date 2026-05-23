package com.davinchicoder.functions

class PersonBuilder {

    var name: String = ""
    var age: Int = 0
    var address: String = ""
    var phone: List<String> = emptyList()

    fun build(): Person {
        return Person(name, age, address, phone)
    }
}

data class Person(var name: String, var age: Int, var address: String, var phone: List<String>)

fun main() {

    val person = person {
        name = "John Doe"
        age = 30
        address = "123 Main St"
        phone = listOf("555-1234", "555-5678")
    }

    println(person)

}

fun person(block: PersonBuilder.() -> Unit): Person {
    return PersonBuilder().apply(block).build()
}
