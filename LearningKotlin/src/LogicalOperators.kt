class LogicalOperators {

}
fun main(){
    val isCorrect = false
    val isReadable =  true

    // Logical && AND
    val  isDataValidInvalid = isReadable && isCorrect
    println("isDataValidInvalid: ${isDataValidInvalid}")

    // Logical || OR
    val  isDataValid = isReadable || isCorrect
    println("isDataValid: ${isDataValid}")

}