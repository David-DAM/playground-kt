package com.davinchicoder.data_structures

import java.util.*

fun main() {

    val pq = PriorityQueue<Int>()

    pq.add(5)
    pq.add(1)
    pq.add(3)

    while (pq.isNotEmpty()) {
        println(pq.poll())
    }
}