package com.davinchicoder.problems

import java.util.Locale.getDefault

//https://exercism.org/tracks/kotlin/exercises/etl
fun main() {

    val scoreMap: MutableMap<Int, List<String>> = mutableMapOf(
        1 to listOf("A", "E", "I", "O", "U", "L", "N", "R", "S", "T"),
        2 to listOf("D", "G"),
        3 to listOf("B", "C", "M", "P"),
        4 to listOf("F", "H", "V", "W", "Y"),
        5 to listOf("K"),
        8 to listOf("J", "X"),
        10 to listOf("Q", "Z")
    )

    val vowelScore: MutableMap<String, Int> = mutableMapOf()
    scoreMap.forEach { (score, vowels) ->
        vowels.forEach { vowel -> vowelScore[vowel.lowercase(getDefault())] = score }
    }

    vowelScore.forEach { (vowel, score) -> println("'$vowel' is worth $score point") }
}