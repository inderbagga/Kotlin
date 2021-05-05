fun main(){

    val cat=Cat("cat",4)
    cat.sound()
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