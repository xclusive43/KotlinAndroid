package classObjects

//3. Primary Constructor
//You can define a primary constructor directly in the class header.

class Person(val name: String, var age: Int) {

    fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

fun main() {
    val person = Person("Robot", 25)
    person.introduce()
}
