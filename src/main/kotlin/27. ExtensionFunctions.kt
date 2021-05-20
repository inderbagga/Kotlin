import java.lang.Math

fun main(){

    15.maths(6)
    "Odd".midValue()
    "Even".midValue()

    val circle=Circle(2.5)
    circle.getArea().also { println(it) }
    circle.perimeter().also { println(it) }

    (-54).abs().also { println(it) }

    display(B())

    val x=AB("Raptor")
    x.output()
    null.output()

    val dFun=SampleClass.display()
    val eFun=SampleClass.extendedFunction()
}

class SampleClass{
    companion object{
        // member function of companion object
        fun display()= println("function inside companion object!")
    }
}

fun SampleClass.Companion.extendedFunction(){
    println("extension function for companion object!");
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

class Circle(val radius:Double){

    fun getArea():Double {
        return Math.PI * radius * radius
    }
}

//Extension function using User defined class
fun Circle.perimeter():Double{
    return 2* Math.PI * radius
}

//Extension function using Library defined class
fun Int.abs():Int{
    return if(this<0)-this else this
}

//Extensions are resolved statically
open class A(val a:Int,val b:Int)

class B :A(5,6)

fun A.operate():Int = a+b

fun B.operate():Int = a*b

// Function to display static dispatch
fun display(a:A){
    println(a.operate())
}
//On nullable types
class AB(private val name:String){
    override fun toString(): String {
        return "the name is $name"
    }
}

fun AB?.output(){
    if(this==null) println("Null")
    else println(this.toString())
}


