import arrow.core.curried

fun main() {
    val add = { x: Int, y: Int -> x + y }

    val curriedAdd = add.curried()
    println("curriedAdd(1) = ${curriedAdd(1)}") // (y: Int) -> 1 + y
    println("curriedAdd(1)(2) = ${curriedAdd(1)(2)}") // 3
}
