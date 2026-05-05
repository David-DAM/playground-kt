package com.davinchicoder.io

import java.io.File

fun main() {
    val file = File("src/main/resources/io/data.txt")

    file.bufferedReader().use { reader ->
        reader.forEachLine { line ->
            println(line)
        }
    }
}