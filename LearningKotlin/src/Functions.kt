class Functions {
}
fun main(){
    //syntax
    /**
     * fun funName(parameter: Type, parameter: Type ...): return Type{
     *      }
     * */
    /**
     * In Kotlin, functions are a fundamental part of the language, and they can be defined in various ways
     * with different levels of complexity. Here’s an overview of how to define and use functions in Kotlin,
     * along with some examples
     * */

    /**
     * 1. Basic Function
     * A simple function that takes no parameters and returns no value:
     * */

    printHello()

    /**
     * 2. Function with Parameters
     * A function that takes parameters:
     * */

    printString("Hello World")

    /**
     * 3. Function with Return Value
     * A function that returns a value:
     * */

        val sumValue =  sum(1,3)
        println("Sum vcalue is ${sumValue}")

    /**
     * 4. Single-Expression Function
     * A function that consists of a single expression can be defined more concisely:
     * */

    val multiplyValue = multiply(2,4)
    println("multiply va,ue is ${multiplyValue}")

    /**
     * 5. Default Arguments
     * Functions can have default parameter values:
     * */

    defaultValueFun("ajay")

    /**
     * 6. Named Arguments
     * You can use named arguments to improve readability, especially with functions that have many parameters:
     * */
    formatText("Hello, Kotlin", capitalize = true, align = "center")


}
fun formatText(text: String, align: String = "left", capitalize: Boolean = false) {
    val formattedText = if (capitalize) text.toUpperCase() else text
    println("Text: $formattedText, Align: $align")
}


fun defaultValueFun(name : String ="Default"){
    println("The value is ${name}")
}

fun multiply(a : Int, b: Int) : Int = a * b

fun sum(i: Int, i1: Int): Int {
return  i + i1 ;
}

fun printHello(){
    println("Hello")
}

fun printString(string:String){
    println(string)
}