package com.davinchicoder.dates

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {
    val today = LocalDate.now()
    println("Today: $today")

    val birthday = LocalDate.of(1995, 5, 10)
    println("Birthday: $birthday")

    val now = LocalDateTime.now()
    println("Now: $now")

    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val formattedDate = today.format(formatter)
    println("Formatted date: $formattedDate")

    val dateString = "03/05/2026"
    val parsedDate = LocalDate.parse(dateString, formatter)
    println("Parsed date: $parsedDate")

    val nextWeek = today.plusDays(7)
    val lastWeek = today.minusDays(7)
    println("In 7 days: $nextWeek")
    println("7 days ago: $lastWeek")
}