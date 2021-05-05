fun main(){

    val schoolA=School("School")
    val schoolB=School("School")

    println(schoolA.toString())
    println(schoolB.toString())
    println(schoolA==schoolB)

    val infoA=Info("Information")
    val infoB=Info("Information")

    println(infoA.toString())
    println(infoB.toString())
    println(infoA==infoB)

    //Destructuring
    val (body,brain)=Human()
    println(body)
    println(brain)
}

class School(val name:String)

data class Info(val about:String)

data class Human(val body:Boolean=true,val brain:Boolean=false)