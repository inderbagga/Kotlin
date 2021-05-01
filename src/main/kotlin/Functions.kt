fun main(){
    //function without parameter
    greetPerson()
    //function with parameter
    greetPerson("Greta")

    //function with return type
    val message=greetPerson("Hey","Revos")
    println(message)

    //single expression function, without return and curly braces
    val about=agePerson(32,"Inder")
    val personA=fullName("Sachin","Tendulkar")
    val personInfoA=personInfo("John","Snow","NightWatch")
    println(about)
    println(personA)
    println(personInfoA)

    //function with default parameters
    val personInfoB=personInfo("Inder","Bagga")
    println(personInfoB)

    //functions with named parameters
    val personB=fullName(fName="VVS",lName="Laxman")
    val personC=fullName(fName="Inder")

    println(personB)
    println(personC)


}

fun fullName(fName:String,lName:String="Kumar")="The name is $fName $lName"

fun personInfo(firstName:String,lastName:String,country:String="India")
    ="$firstName $lastName hails from $country."

fun agePerson(age:Int,name:String)="$name is $age years old."

fun greetPerson(greeting: String,name: String):String{
    return "$greeting $name"
}

fun greetPerson(name: String) {
    println("Hello $name")
}

fun greetPerson(){
    println("Hello Tejas!")
}