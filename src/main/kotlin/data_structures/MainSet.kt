package data_structures;

fun main() {

    val set1 = setOf(1, 2, 3, 4)
    val set2 = setOf(3, 4, 5, 6)

    println("Union ${set1 union set2}")
    println("Intersection ${set1 intersect set2}")
    println("Subtraction ${set1 subtract set2}")
}
