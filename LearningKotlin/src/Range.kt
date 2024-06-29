class Range {
}

/**
 * In Kotlin, ranges are a fundamental feature used to express a sequence of values
 * between a start and an end. Ranges can be used for iterating over numbers, checking
 * conditions, or creating collections. Here are the main types of ranges in Kotlin:
 *
 * 1. Inclusive Ranges (..)
 * Inclusive ranges include both the start and end values. The syntax is startValue..endValue.
 **/
fun main(){

    /** 1. Inclusive Ranges (..)
     * Inclusive ranges include both the start and end values. The syntax is startValue..endValue.
     *
     **/
    val range = 1..5 // Represents the range from 1 to 5 inclusive
    println("Ranges: ${range}")

    /**
     * 2. Exclusive Ranges (until)
     * Exclusive ranges include the start value but exclude the end value. The syntax is startValue until endValue.
     **/
    val rangeExclusive = 1 until 5 // Represents the range from 1 to 4 (excluding 5)
    println("Ranges: ${rangeExclusive}")
    1 until 5

    /**
     * 3. Using Ranges in Loops
     * Ranges are commonly used in for loops to iterate over a sequence of numbers:
     * **/
    for (i  in rangeExclusive){
        println("For Loops: ${i}")
    }
}