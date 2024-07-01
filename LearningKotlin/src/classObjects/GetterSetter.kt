package classObjects

class GetterSetter(var name: String,var age: Int) {
    var fname: String
        get() =  if (name.isNotEmpty()) name else ""
        set(value) {
            if (value.isNotEmpty()){
                name = value
            }
        }

    var fage : Int
        get() = if (age > 12) 24 else age
        set(value) {
            if (value > 0){
                age =  value
            }
        }

    fun introduce() {
        println("Hello, my name is $fname and I am $age years old.")
    }
}

fun main(){
    val getterSetter = GetterSetter("ajay", 23)
   getterSetter.introduce()
    getterSetter.name = "Vijay"
    getterSetter.age = 90
    println(getterSetter.fname)
    println(getterSetter.fage)
   getterSetter.introduce()
}