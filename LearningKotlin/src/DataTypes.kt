class DataTypes {
    val intTypeVariable : Int = 1
    val floatTypeVariable : Float = 1.0F
    val decimalTypeVariable  : Double = 1.00

    val isBooleanTypeVariable : Boolean = true
    val charTypeVariable : Char = 'A'
    val stringTypeVariable : String = "Hello"

}

fun main(){
 val  dataTypesInstance = DataTypes();
    println(dataTypesInstance.intTypeVariable)
    println(dataTypesInstance.floatTypeVariable)
    println(dataTypesInstance.isBooleanTypeVariable)
    println(dataTypesInstance.stringTypeVariable)
}