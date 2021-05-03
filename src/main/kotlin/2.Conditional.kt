fun main(){

    val age=21

    if(age.rem(2) == 0) println("Age is even")
    else if(age == 33) println("Age is 33")
    else println("Age is odd")

    when{
        age.rem(2) == 0 -> println("Age is even")
        age == 33 -> println("Age is 33")
        else -> println("Age is odd")
    }

    when(age){

        in 10..19 -> println("Teenager")
        in 20..50 -> println("Adult")
        else -> println("Not Defined")
    }
}