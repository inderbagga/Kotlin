fun main(){

    //object: The implementation of blueprint
    val userA=User()
    println("UserA age is ${userA.age}")
    userA.updateAge(age=33)
    println("UserA age is ${userA.age}")
    println("UserB age is ${User().age}")
}

//Blueprint
class User{
    var age=0

    fun updateAge(age:Int=0){
        this.age =age
    }
}