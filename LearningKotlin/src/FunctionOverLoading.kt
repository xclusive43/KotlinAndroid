class FunctionOverLoading {
}
fun main(){
    println("Addition: ${addition(1,2)}")
    println("Addition: ${addition(1.00,3.00)}")
    println("Subtraction: ${subtraction(b=20,a=10)}")
}

fun addition(a: Int, b: Int): Int {
    return  a+b;
}

fun  addition(a: Double, b:Double): Double{
    return a+b;
}

fun subtraction(a: Int, b: Int): String {
    println("a : $a b: $b")
    return if ((a - b) != 0)  "Valid" else "Invalid";
}