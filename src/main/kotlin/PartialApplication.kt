import arrow.core.partially1
import arrow.core.partially2

fun main() {
    val add3 = { a: Int, b: Int, c: Int -> a + b + c }
    val fivePlus = add3.partially1(2).partially2(3)

    println(fivePlus(4)) // 9
}
