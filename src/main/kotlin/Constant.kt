import entity.Person

fun main() {
    Constant.constant()
    Constant.constantFunction()
}

object Constant {
    private const val FIVE = 5

    fun constant() {
        val john = Person("John", 30)
        println(john.age + FIVE == Person("John", 30).age + 5)
    }

    fun constantFunction() {
        val constant = { a: Any -> { _: Any -> a } }
        println(listOf(1, 2).map(constant(0))) // [0, 0]
    }
}
