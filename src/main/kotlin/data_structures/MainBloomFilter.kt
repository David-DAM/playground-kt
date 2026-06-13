package com.davinchicoder.data_structures

import java.nio.ByteBuffer
import java.security.MessageDigest
import java.util.*

class BloomFilter(
    size: Int,
) {

    private val bits = BitSet(size)

    fun add(item: String) {
        hash(item).let {
            bits.set(it)
        }
    }

    fun mightContain(item: String): Boolean {
        return hash(item).let {
            bits.get(it)
        }
    }

    private fun hash(item: String, seed: Int = 100): Int {
        val md = MessageDigest.getInstance("MD5")
        val bytes = md.digest((item + seed).toByteArray())

        return ByteBuffer.wrap(bytes).int and Int.MAX_VALUE
    }
}

fun main() {
    val bloom = BloomFilter(10_000)

    bloom.add("apple")
    bloom.add("banana")
    //We can know if an item is in the filter, but we can't tell if it's definitely not there
    println(bloom.mightContain("apple"))   // true (sure)
    println(bloom.mightContain("banana"))  // true (sure)
    println(bloom.mightContain("orange"))  // false or true (possible false positive)
}