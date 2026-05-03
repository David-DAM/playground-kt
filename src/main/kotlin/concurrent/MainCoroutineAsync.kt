package com.davinchicoder.concurrent

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {

    val deferred1 = async {
        delay(1000.milliseconds)
        10
    }

    val deferred2 = async {
        delay(1000.milliseconds)
        20
    }

    val result = deferred1.await() + deferred2.await()

    println("Result: $result")
}