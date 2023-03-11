fun main() {
    val result: Int = Calculator.sum(4,9)
    println(result)
}

class Calculator(){
    companion object{
        fun sum(a: Int, b: Int): Int{
            return a + b
        }
    }
}