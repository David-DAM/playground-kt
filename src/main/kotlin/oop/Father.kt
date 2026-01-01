package com.davinchicoder.oop

data class Father(
    val name: String,
    val age: Int,
    val height: Double,
    val address: String,
    val phones: List<String>

) : Human(name, age, height), PersonInterface {

    override fun talk() {
        println("Hi, my name is $name, I am $age years old, I am $height tall and my address is $address")
    }
}