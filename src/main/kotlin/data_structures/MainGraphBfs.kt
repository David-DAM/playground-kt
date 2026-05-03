package com.davinchicoder.data_structures

import java.util.*

fun main() {

    val graph = mapOf(
        1 to listOf(2, 3),
        2 to listOf(4),
        3 to listOf(),
        4 to listOf()
    )

    fun bfs(start: Int) {
        val visited = mutableSetOf<Int>()
        val queue = ArrayDeque<Int>()

        queue.add(start)
        visited.add(start)

        while (queue.isNotEmpty()) {
            val node = queue.removeFirst()
            println(node)

            for (neighbor in graph[node].orEmpty()) {
                if (visited.add(neighbor)) {
                    queue.add(neighbor)
                }
            }
        }
    }

    bfs(1)
}