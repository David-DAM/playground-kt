package com.davinchicoder.io

import java.io.File

fun main() {
    val file = File("src/main/resources/io/data.txt")
    val data = "Kotlin lovers!"

    file.appendText(data)
}