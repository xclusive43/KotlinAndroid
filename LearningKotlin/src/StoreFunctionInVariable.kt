
fun main(){
    val  fn = :: additionDemo

    println("Addition: ${fn(2,4)}")

}

fun additionDemo(a: Int, b: Int): Int {
    return  a+b;
}

