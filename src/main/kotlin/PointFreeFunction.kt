fun main() {
    // Given
    val map = { fn: (Int) -> Int ->
        { list: List<Int> ->
            list.map(fn)
        }
    }
    val add = { a: Int -> { b: Int -> a + b } }

    // Then

    // Not point-free - `numbers` is an explicit argument
    val incrementAll = { numbers: List<Int> ->
        map(add(1))(numbers)
    }

    // Point-free - The list is an implicit argument
    val incrementAll2 = map(add(1))

    println(incrementAll(listOf(1, 2, 3))) // [2, 3, 4]
    println(incrementAll2(listOf(1, 2, 3))) // [2, 3, 4]
}
