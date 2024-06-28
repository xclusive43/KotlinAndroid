class Statements {
}

fun main(){

    //if else statements
    val isRaining = false
    val isMist =  false
    if(isRaining && isMist){
        println("Raining and the full of mist!!!")
    }
    else if (isRaining){
        println("Raining now")
    }
    else  if(isMist){
        println("full of mist!!!")
    }
      else{
        println("Seams like weather is clear")
    }


    // Assign value as per condition
    val temperature = 10
    val returnedValue = if (isMist &&  temperature.equals(10)) {
        "nice weather"
    }else{
        "sunlight"
    }
    println(returnedValue)

    //no support for ternary operator in kotlin but we can use like this
    // Using if expression as a ternary operator
    val ternaryValue = if (isMist &&  temperature.equals(10)) "nice weather" else "sunlight"
    println("-->: "+ternaryValue)


    val arrayList = (0..100).toCollection(ArrayList())
    println(arrayList)

    for (number in arrayList) {
        if (number % 2 != 0) {
            println("$number is an odd number")
        } else{
            println("$number is an even number")
        }
    }
}