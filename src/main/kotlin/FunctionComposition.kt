import kotlin.math.floor

fun main() {
    infix fun <A, B, C> ((B) -> C).compose(g: (A) -> B): (A) -> C = { x: A -> this(g(x)) }
    val floorAndToString = { x: Double -> x.toString() }.compose { x: Double -> floor(x) }
    println(floorAndToString(121.212121)) // '121.0'
}
