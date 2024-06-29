class When {
}
fun main(){
    var animal = "Dog"
    /**
     * The if expression evaluates a condition and executes the corresponding block of code.
     * The last expression in each block is returned and can be assigned to a variable.
     * */
//     if (animal == "Cat"){
//         println("Animal is ${animal}")
//     } else  if (animal == "Dog"){
//         println("Animal is ${animal}")
//     }else  if (animal == "Goat"){
//         println("Animal is ${animal}")
//     } else{
//         println("Unknown Animal name: ${animal}")
//     }


    /**
     * To convert this un-structure, unreadable if statements  in when
     *
     * The when expression checks the value of animal.
     * Each case in the when expression handles a specific value ("Cat", "Dog", "Goat"), and the corresponding block of code is executed.
     * The else branch handles any values that do not match the specified cases, providing a default behavior.
     * The when expression is more concise and readable compared to multiple if-else statements, especially when dealing with multiple conditions.
     * */
    when(animal){
        "Cat" -> println("Animal is ${animal}")
        "Dog" -> println("Animal is ${animal}")
        "Goat" -> println("Animal is ${animal}")
        else -> println("Unknown Animal name: ${animal}")
    }

    val result =  when(animal){
        "Cat" -> "Animal is ${animal}"
        "Dog" -> "Animal is ${animal}"
        "Goat" -> "Animal is ${animal}"
        else -> "Unknown Animal name: ${animal}"
    }
    println(result)

    val intResult = when(20){
        10 -> "Ten"
        20 -> "Twenty"
        30 -> "Thirty"
        else -> "Unknown"
    }
    println(intResult)

    val intResult2 = when(20){
        10 -> "Ten"
        in  20 until 30 -> "Twenty"
        30 -> "Thirty"
        else -> "Unknown"
    }
    println(intResult2)

    val intResult3 = when(30){
        10 -> "Ten"
        in  20 .. 30 -> "Twenty or Thirty"
        40 -> "Forty"
        else -> "Unknown"
    }
    println(intResult3)
}