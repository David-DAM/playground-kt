package com.davinchicoder.data_structures

fun main() {

    class Graph {
        private val adj = mutableMapOf<Int, MutableList<Int>>()

        fun addEdge(from: Int, to: Int) {
            adj.computeIfAbsent(from) { mutableListOf() }.add(to)
        }

        fun printGraph() {
            adj.forEach { (node, neighbors) ->
                println("$node -> $neighbors")
            }
        }

        // DFS
        fun dfs(start: Int, visited: MutableSet<Int> = mutableSetOf()) {
            if (!visited.add(start)) return
            println(start)

            adj[start]?.forEach {
                dfs(it, visited)
            }
        }
    }

    val graph = Graph()
    graph.addEdge(1, 2)
    graph.addEdge(1, 3)
    graph.addEdge(2, 4)

    graph.printGraph()

    println("DFS:")
    graph.dfs(1)
}