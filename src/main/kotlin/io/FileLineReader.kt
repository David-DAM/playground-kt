package com.davinchicoder.io

import java.io.File

fun main() {
    val file = File("src/main/resources/io/data.txt")

    file.useLines { lines ->
        lines.forEach { line ->
            println(line)
        }
    }

    println("File reading completed")
}