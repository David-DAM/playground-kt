package com.davinchicoder.concurrent

import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Semaphore
import kotlinx.coroutines.sync.withPermit
import kotlin.time.Duration.Companion.seconds

fun main() = runBlocking {

    var counter = 0
    val semaphore = Semaphore(3)

    val jobs = List(12) {
        launch {
            println("Starting job: ${it + 1}")
            semaphore.withPermit {
                delay(2.seconds)
                println("Job ${it + 1} finished")
                counter++
            }
        }
    }

    jobs.joinAll()

    println("Counter: $counter")
}