fun main() {
    PureFunction.example1()
    PureFunction.example2()
    PureFunction.example3()
}

object PureFunction {
    fun example1() {
        val greet = { name: String -> "Hi, $name" }

        println(greet("Brianne")) // "Hi, Brianne"
    }

    fun example2() {
        data class Window(val name: String)
        val window = Window("Brianne")

        val greet = { "Hi, ${window.name}" }

        println(greet()) // "Hi, Brianne"
    }

    fun example3() {
        var greeting = ""

        val greet = { name: String -> greeting = "Hi, $name" }

        greet("Brianne")
        println(greeting) // "Hi, Brianne"
    }
}
