fun main() {
    println(Max(2).compose(Max(3)).compose(Max(5))) // Max(5)
}

class Max(private val a: Int) {

    fun compose(that: Max): Max {
        return if (this.a > that.a) this else that
    }

    override fun toString() = "Max($a)"
}
