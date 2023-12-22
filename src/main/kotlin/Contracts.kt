fun main() {
    val contract = { input: Any ->
        if (input is Int) {
            input
        } else {
            throw Exception("Contract violated: expected Number")
        }
    }

    val addOne = { num: Any ->
        contract(num) + 1
    }

    println(addOne(2)) // 3
    println(addOne("some string")) // Contract violated: expected int -> boolean
}
