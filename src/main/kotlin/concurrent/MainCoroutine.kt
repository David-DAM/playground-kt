package com.davinchicoder.concurrent

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {

    println("Start")

    val job1 = launch {
        task("1")
    }

    val job2 = launch {
        task("2")
    }

    println("Waiting...")

    job1.join()
    job2.join()

    println("End")
}

suspend fun task(name: String) {
    println("Start task $name in thread: ${Thread.currentThread().name}")

    delay(2000.milliseconds)

    println("End task $name in thread: ${Thread.currentThread().name}")
}