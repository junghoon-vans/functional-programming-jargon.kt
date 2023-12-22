import kotlin.math.abs

fun main() {
    println(abs(abs(10)))

    val sort = { list: List<Int> -> list.sorted() }
    println(sort(sort(sort(listOf(2, 1))))) // [1, 2]
}
