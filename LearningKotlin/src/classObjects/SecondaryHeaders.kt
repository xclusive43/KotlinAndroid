package classObjects

class Car {
    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    fun introduce() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

fun main() {
    val car = Car("Tata", 4)
    car.introduce()
}
