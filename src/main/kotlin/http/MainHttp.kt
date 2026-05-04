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
    return connection.apply {
        connectTimeout = 5000
        readTimeout = 5000
        requestMethod = "GET"
        setRequestProperty("Content-Type", "application/json")
    }.run {
        inputStream.bufferedReader().use { it.readText() }
    }.also {
        connection.disconnect()
    }
}
