class Variables {
}
fun main(){
    val a = 1; //In Kotlin, val is used to declare a read-only property, which means its value cannot be reassigned once it has been initialized. To create a variable that can be reassigned, you should use var instead of val.
    var b =2; //Using var, you can reassign the variable
    b = 8;
    println("Variable a "+ (a + b));

    var stringValue = "demo one";
    val stringValueVal = "hello";
    stringValue = stringValue+"de";
    println(stringValue.length);


    //data type

}