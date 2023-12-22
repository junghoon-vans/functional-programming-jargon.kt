fun main() {
    val sum = { a: Int, b: Int -> a + b }
    val inc = { a: Int -> a + 1 }
    val zero = { 0 }

    println("sum(1, 2) = ${sum(1, 2)}") // sum(1, 2) = 3
    println("inc(1) = ${inc(1)}") // inc(1) = 2
    println("zero() = ${zero()}") // zero() = 0
}
