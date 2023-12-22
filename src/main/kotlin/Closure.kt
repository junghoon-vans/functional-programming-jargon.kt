fun main() {
    val addTo = { x: Int -> { y: Int -> x + y } }
    val addToFive = addTo(5)

    println(addToFive(3)) // => 8
}
