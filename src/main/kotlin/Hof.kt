import kotlin.reflect.KClass

fun main() {
    val filter = { predicate: (Any) -> Boolean, xs: List<Any> -> xs.filter(predicate) }
    val isA = { type: KClass<out Any> -> { x: Any -> type.isInstance(x) } }

    println(filter(isA(Int::class), listOf(0, "1", 2))) // [0, 2]
}
