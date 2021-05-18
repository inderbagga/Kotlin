fun main(){

    //ordinary way
    val result=square(5)
    println(result)

    //Lambda usecase
    val square :(Int) -> (Int) = { number ->
        number *number}
    println(square(6))

    var printName:(String) -> (Unit) = {
        println(it)
    }
    printName("Tejas")

}

fun square(number:Int):Int=number * number