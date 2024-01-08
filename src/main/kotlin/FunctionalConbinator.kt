fun main() {
    val c = { f: (Int) -> (Int) -> Int -> { a: Int -> { b: Int -> f(b)(a) } } }

    val divide = { a: Int -> { b: Int -> a / b } }

    val divideBy = c(divide)

    val divBy10 = divideBy(10)

    println(divBy10(30)) // => 3
}
