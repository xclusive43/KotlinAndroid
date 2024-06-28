class Loops {
}
fun main(){
    //While
    var count = 5
    while (count >= 1){
       // println(count)
        count--
    }

    var a = 2
    var index = 1

    while (index <= 10){
       // println("2 x ${index} = ${(2*index)}")
        index++
    }

    //Do while

    var index1 = 5
    do {
        println(index1)
        index1--
    }while (index1 >= 1)


    //For loop
     for (i in 10 .. 20){
         println("i: ${i}")
     }

    for (i in 10 .. 20 step 2){
        println("i1: ${i}")
    }

    for (i in 10 downTo 4){
        println("downTo i2: ${i}")
    }

    for (i in 10 downTo 4 step  2){
        println("downTo i2 step: ${i}")
    }

    for (i in 10 until 12){
        println("j: ${i}")
    }
    for (i in 10 until 15 step  3){
        println("j1: ${i}")
    }
    for (i in 10 until 15 step  2){
        println("j2: ${i}")
    }
}