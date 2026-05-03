package com.davinchicoder.concurrent

import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

fun main() = runBlocking {

    var counter = 0
    val mutex = Mutex()

    val jobs = List(1000) {
        launch {
            mutex.withLock {
                counter++
            }
        }
    }

    jobs.joinAll()

    println("Counter: $counter")
}