fun main() {
    Continuation.example1()
    Continuation.example2()
}

object Continuation {
    fun example1() {
        val printAsString = { num: Int -> println("Given $num") }
        val addOneAndContinue = { num: Int, cc: (Int) -> Unit ->
            {
                val result = num + 1
                cc(result)
            }
        }
        addOneAndContinue(2, printAsString)() // 'Given 3'
    }

    fun example2() {
        fun continueProgramWith(data: String) {
            // Continues program with data
        }

        fun readFileAsync(file: String, cb: (Throwable?, String) -> Unit) {
            // Reads file asynchronously and calls cb with result
        }

        readFileAsync("path/to/file") { err, result ->
            if (err != null) {
                // handle error
                return@readFileAsync
            }
            continueProgramWith(result)
        }
    }
}
