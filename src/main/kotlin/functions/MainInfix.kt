package com.davinchicoder.functions

fun main() {
    val dangerousCountries = listOf("MR", "FR")
    val transaction = Transaction(amount = 10000, country = "ESP", velocity = 20)
    rule(transaction) {
        amount greaterThan 10
        country notIn dangerousCountries
        velocity above 2
    }
}

data class Transaction(val amount: Int, val country: String, val velocity: Int)

class RuleContext(transaction: Transaction) {

    val amount = AmountField(transaction.amount)
    val country = CountryField(transaction.country)
    val velocity = VelocityField(transaction.velocity)
}

class AmountField(val amount: Int) {

    infix fun greaterThan(value: Int) {
        require(amount > value) { "Amount must be greater than $value" }
        println("amount > $value")
    }
}

class CountryField(val country: String) {

    infix fun notIn(countries: List<String>) {
        require(country !in countries) { "Country must not be in $countries" }
        println("country not in $countries")
    }
}

class VelocityField(val velocity: Int) {

    infix fun above(value: Int) {
        require(velocity > value) { "Velocity must be above $value" }
        println("velocity > $value")
    }
}

fun rule(transaction: Transaction, block: RuleContext.() -> Unit) {

    val context = RuleContext(transaction)

    context.block()
}