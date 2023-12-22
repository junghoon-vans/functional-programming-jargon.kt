fun main() {
    val predicate = { a: Int -> a > 2 }

    println(listOf(1, 2, 3, 4).filter(predicate)) // [3, 4]
}
