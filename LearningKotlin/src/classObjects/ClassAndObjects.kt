package classObjects

class ClassAndObjects {
    /**
     * In Kotlin, classes and objects are fundamental building blocks for object-oriented programming.
     * Here's an overview of how to define and use classes and objects in Kotlin:
     * */





}
fun main(){
    /*
    * Creating an Object (Instance) of a Class
    * You can create an instance of a class using the new keyword (implicitly).
    * */
    val employee = Employee();
    val employeeNew =  employee;
    println("${employee.hashCode()} == ${employeeNew.hashCode()}")
    employee.name = "AJAY"
    employee.empId ="001"

    employee.showEmployeeDetails()

}
/**
* 1. Defining a Class
* A class in Kotlin can have properties (variables) and functions (methods).
* */
class Employee{
    var name: String =""
    var empId: String = ""

    fun showEmployeeDetails(){
        println("Employee Name: $name \nEmployeeId: $empId")
    }
}