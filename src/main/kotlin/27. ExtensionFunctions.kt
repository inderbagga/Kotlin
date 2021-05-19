fun main(){

    15.maths(6)
    "Odd".midValue()
    "Even".midValue()
}

fun Int.maths(num:Int){

    println("Addition is: ${this+num}")
    println("Subtraction is: ${this-num}")
    println("Multiplication is: ${this*num}")
}

fun String.midValue(){

    if(this.length%2!=0) println("$this's midpoint is at position: ${this.length/2}")
    else println("String has no midpoint.")
}