package classObjects
//Kotlin supports class inheritance using the open keyword.
open class InheritanceParent {
   open fun introduce(){
        println("Hello Boy im am your parent!!")
    }
}

class Child : InheritanceParent() {
    override fun introduce() {
        println("Hello DaD im am your Boy!!")
    }
}

fun main(){
    val child = Child();
    val inheritanceParent = InheritanceParent()

    child.introduce()
    inheritanceParent.introduce()

    //second class
    val cell =  Cell("Intex", "Passed", 23)
    cell.introduce()

    val battery = Battery("Nokia", 1001)
    battery.bName = "Nokia"
    battery.introduce()
}



private open class Battery(var name: String, val charged: Int){

    var bName: String
        get() = if (name.isEmpty()) "Unknown Battery Name" else name
        set(value) {
            if (value.length > 3){
                name = name+" Dameged"
            }
        }

   open fun introduce(){
        println("I am $name Battery with charged: $charged")
    }
}

private class Cell (name: String, var status: String, charged: Int): Battery(name, charged){
    override fun introduce() {
        println("I am a $name Battery with charged: $charged with status: $status")
    }
}


