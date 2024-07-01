class Arrays {
}
/**
 * In Kotlin, arrays are a built-in data structure that allows you to store multiple
 * values of the same type. Arrays are fixed in size once created. Here’s an overview
 * of how to work with arrays in Kotlin:
 * */
fun main(){
/**
 * 1. Creating Arrays
 * You can create arrays using the arrayOf function or the Array constructor.
 *
 * Using arrayOf Function:
 * */

    val array1 = arrayOf(1,2,3,4,5,6..90)
    val stringArray = arrayOf("a","b","v")
    println(array1.joinToString())
    println(stringArray.joinToString())

    for (item in array1){
        println(item)
    }
    for ((item,i) in array1.withIndex()){ //with index
        println("${i}: "+item)
    }



    stringArray.forEach { item -> println(item) } // for each

    println(array1.size) // to get size
    array1.set(5, 6) // set value at index

    println(array1.joinToString())
    println(array1.get(5)) //get value at index

    println(stringArray.contains("a")) // contains check

    println(stringArray.reverse()) //reverse array

    println("lastIndex: "+ stringArray.lastIndex)

/**
 * 5. Primitive Type Arrays
 * Kotlin provides specialized classes for arrays of primitive types to avoid boxing overhead:
 * IntArray, DoubleArray, LongArray, etc.
 *
 * Creating Primitive Arrays:
 * */
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    val doubleArray = doubleArrayOf(1.0, 2.0, 3.0)
    val stringArrayOf = arrayOf("Are","WE")

    println(intArray.joinToString())
    println(doubleArray.joinToString())
    println(stringArrayOf.joinToString())

    /**
     * 6. Multi-dimensional Arrays
     * You can create multi-dimensional arrays by nesting arrays.
     *
     * 2D Array Example
     * */

    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    for (row in matrix) {
        println(row.joinToString())
    }

    /**
     * 7. Array Initialization with Lambda
     * You can initialize arrays using a lambda expression to define initial values.
     * */
    val squares = Array(5) { i -> i * i }
    println(squares.joinToString())
}