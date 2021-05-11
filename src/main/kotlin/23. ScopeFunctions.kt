fun main(){
    var numberList= mutableListOf("21","452","23","42","63","4695")

    //let scope function
    numberList.map { it.length }.filter { it>3 }.let { println(it) }

    val nullableString:String?="it can be null"

    //kotlin approach
    nullableString?.let { println(nullableString) }

    //java approach
    if(nullableString!=null) println(nullableString)
}