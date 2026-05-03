package com.davinchicoder.concurrent

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {

    launch(Dispatchers.Default) {
        println("CPU work on thread: ${Thread.currentThread().name}")
    }

    launch(Dispatchers.IO) {
        println("IO work on thread: ${Thread.currentThread().name}")
    }

    println("Waiting...")
    delay(2000.milliseconds)
    println("End")
}