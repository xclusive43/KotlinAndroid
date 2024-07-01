package classObjects


class InitializationBlock(val name: String, var age: Int) {

    //Initialization blocks can be used to perform additional initialization logic.
    init {
        println("A new person object is created: $name, $age")
    }

    fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

fun main() {
    val initializationBlock = InitializationBlock("Intex", 3)
    initializationBlock.introduce()
}
