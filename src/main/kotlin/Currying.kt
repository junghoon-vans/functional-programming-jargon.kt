fun main() {
    val sum = { a: Int, b: Int -> a + b }
    val curriedSum = { a: Int -> { b: Int -> a + b } }
    println(curriedSum(40)(2)) // 42

    val add2 = curriedSum(2) // (b: Int) -> 2 + b
    println(add2(10)) // 12
}
