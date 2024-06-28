class Operators {
    var i =1
    var j =12

    fun operateArithmeticOperations(){
        println("i + j = ${i + j}")
        println("i - j = ${i - j}")
        println("i * j = ${i * j}")
        println("i % j = ${i % j}")

        println("i > j = ${i > j}")
        println("i < j = ${i < j}")
        println("i === j = ${i === j}") //its deprecated
        println("i == j = ${i == j}")
        println("i >= j = ${i >= j}")
        println("i <= j = ${i <= j}")

        // Post-increment and post-decrement
        println("i++ = ${i++}")  // Prints the current value of i, then increments
        println("i-- = ${i--}")  // Prints the current value of i, then decrements

        // Pre-increment and pre-decrement
        println("--i = ${--i}")  // Decrements first, then prints the new value of i
        println("++i = ${++i}")  // Increments first, then prints the new value of i

        println("++i + i++ = ${++i + i++}")  // Increments first, then prints the new value of i
        println("++i + i++ = ${++i - i++}")  // Increments first, then prints the new value of i

        println("++i + i++ = ${--i + i++}")  //
        println("++i + i++ = ${--i - i--}")  //
    }
}
fun main(){
    val operators = Operators()
    operators.operateArithmeticOperations()
}