package com.davinchicoder.concurrent

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {

    val channel = Channel<Int>()

    val job = launch {
        var counter = 0
        for (value in channel) {
            counter += value
        }
        println("Final counter: $counter")
    }

    repeat(1000) {
        launch {
            channel.send(1)
        }
    }

    delay(1000.milliseconds)
    channel.close()
    job.join()
}