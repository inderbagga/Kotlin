fun main(){

    //object: The implementation of blueprint
    val pDriver=Driver(age=33,"Tom","Cruise")
    println("Age of Primary Driver ${pDriver.fullName} is ${pDriver.myAge}")

    val sDriver=Driver("Sherry",21)
    println("Age of Secondary Driver ${sDriver.fullName} is ${sDriver.myAge}")

    val dDriver=Driver()
    println("Age of Driver ${dDriver.fullName} is ${dDriver.myAge}")
}

//class with primary constructor
class Driver(age:Int=0, fName:String, lName:String){

    var myAge:Int = age
    var fullName:String = "$fName $lName"

    constructor(fName:String, age:Int) : this(age,fName,"") {
        println("Secondary Constructor called")
    }

    constructor(fName:String="Default") : this(18,fName,"") {
        println("Default Constructor called")
    }
}