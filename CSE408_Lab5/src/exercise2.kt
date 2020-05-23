fun main() {

    print("Enter age: ")
    val age = Integer.valueOf(readLine())

    when (age){
        in 0..20 -> print("Family")
        in 21..59 -> print("Normal")
        in 60..100 -> print("Senior")
        else -> print("Probably not alive")
    }

   }
