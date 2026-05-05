package com.davinchicoder.concurrent

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {

    val numbersFlow = flow {
        println("Flow started")
        for (i in 1..10) {
            delay(500.milliseconds)
            println("Emitting $i")
            emit(i)
        }
    }

    println("Collecting flow...")
    numbersFlow.collect { value ->
        println("Collected: $value")
    }

    println("Flow collection finished")
}