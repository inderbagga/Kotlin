fun main(){

    val animal=Animal("elephant",14)
    val cat=Cat("cat",4)
    cat.sound()

    val math=Addition(1,2)
    println("The sum is ${math.add()}")
}

open class Animal(type:String,age:Int){

    open val name:String=type

    init{
        println("Animal of age $age is a $type.")
    }

    fun eat()=println("can eat")
    fun sleep()=println("can sleep")
    fun run()=println("can run")
    open fun sound()=println("can sound")
}

class Cat(type:String, age:Int): Animal(type,age){

    override val name:String="Kitty"

    override fun sound() {
        println("$name makes sound of meow.")
    }
}

class Addition(num1:Int,num2:Int):Math(num1,num2)

open class Math(private val num1:Int, private val num2:Int){

   open fun add()=num1.plus(num2)
}