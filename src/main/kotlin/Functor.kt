import arrow.core.Some

fun main() {
    println(Some(1).map { it }) // = Option.Some(1)

    val f = { x: Int -> x + 1 }
    val g = { x: Int -> x * 2 }

    println(listOf(1, 2, 3).map { x -> f(g(x)) }) // = [3, 5, 7]
    println(listOf(1, 2, 3).map(g).map(f)) // = [3, 5, 7]

    println(listOf(1))
}
