package com.davinchicoder.concurrent

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.selects.whileSelect
import kotlin.time.Duration.Companion.milliseconds

@OptIn(ExperimentalCoroutinesApi::class)
fun main() = runBlocking {

    val channel1 = Channel<String>()
    val channel2 = Channel<String>()

    launch {
        repeat(5) { i ->
            delay(300.milliseconds)
            channel1.send("Channel 1: $i")
        }
        channel1.close()
    }

    launch {
        repeat(3) { i ->
            delay(500.milliseconds)
            channel2.send("Channel 2: $i")
        }
        channel2.close()
    }

    whileSelect {
        channel1.onReceiveCatching { result ->
            result.getOrNull()?.let { value ->
                println("Received from $value")
                true
            } ?: false
        }
        channel2.onReceiveCatching { result ->
            result.getOrNull()?.let { value ->
                println("Received from $value")
                true
            } ?: false
        }
    }

    println("WhileSelect finished")
}