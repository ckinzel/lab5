class MathTeacher(vschool: String, vname: String, vage: Int) : Person(vname, vage){
    var school: String = vschool
    fun teachMath(){
        println("I teach in $school")
    }
}

class Footballer(vteam: String, vname: String, vage: Int) : Person(vname, vage){

    var team : String = vteam
    fun playFootball(){
        println("I play for $team")
    }
}

class Businessman(vemp: String, vname: String, vage: Int) : Person(vname, vage){

    var emp :String = vemp
    fun runBusiness(){
        println("I work for $emp")
    }
}

open class Person(vname:String, vage:Int){

    var name: String = vname
    var age: Int = vage
    fun talk(){
        println("My name is ${name}")
        println("My age is ${age}")
    }
    fun walk(){
        println("Walking")
    }
    fun eat(){
        println("Eating")
    }
}

fun main(){

    val me = MathTeacher("UCR", "Charles", 40)

    me.talk()
    me.teachMath()

}

