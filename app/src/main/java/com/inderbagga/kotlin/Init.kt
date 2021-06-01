fun main(){

    val studentA=Student(12,"English")
    val studentB=Student()
    println("Student having ${studentA.age} of age is studying in ${studentA.medium} medium branch")
    println("Student having ${studentB.age} of age is studying in ${studentB.medium} medium branch")

}

class Student(private var _age:Int,private var _medium:String){
    var age = _age
    var medium = _medium

    init{
        println("initializer called with $age and $medium")
    }

    constructor(age:Int=10):this(age,"hindi"){
        println("secondary constructor called with $age $_age $medium $_medium")
    }
}