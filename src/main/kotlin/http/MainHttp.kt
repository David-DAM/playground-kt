package com.davinchicoder.http

import java.net.HttpURLConnection
import java.net.URI

private const val BASE_URL = "https://jsonplaceholder.typicode.com"


fun main() {
    val response = get("posts")
    println(response)
}


fun get(endpoint: String): String {
    val uri = URI("$BASE_URL/$endpoint").toURL()
    val connection = uri.openConnection() as HttpURLConnection

    connection.requestMethod = "GET"
    connection.setRequestProperty("Content-Type", "application/json")

    return try {
        connection.inputStream.bufferedReader().use { it.readText() }
    } finally {
        connection.disconnect()
    }
}
