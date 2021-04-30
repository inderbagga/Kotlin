fun main(){

    print("Tejas!")
    println("Hello")
    print("World")

    // single line comment
    /*multi-line
    comment*/

    //Variables
    var firstName="Inder"
    var lastName='B'

    val age=32
    val isMale=true

    //Types
    val personName:String="Greta"
    println(personName)
    val isAndroid:Boolean=true
    println(isAndroid)
    val longValue:Long=545L //64 bit
    println(longValue)
    val intValue:Int=3512324 //32 bit
    println(intValue)
    val shortValue:Short=4623 //16 bit
    println(shortValue)
    val byteValue:Byte=127 //8 bit
    println(byteValue)
    val floatValue:Float=545F //64 bit
    println(floatValue)
    val doubleValue:Double=3512324.0 //32 bit
    println(doubleValue)

    //Operations on Variable

    val number1= 24132
    val number2=14534

    var result=number1.plus(number2)
    println(result)
    result=number1.minus(number2)
    println(result)
    result=number1.div(number2)
    println(result)
    result=number1.times(number2)
    println(result)

    val fullName="$firstName $lastName"
    println(fullName)


}