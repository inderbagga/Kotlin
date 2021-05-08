fun main(){

    val pair=Pair("Sachin","Tendulkar")
    val listPair=pair.toList()
    listPair.forEach { println(it) }
    println(pair.first)
    println(pair.second)
    val (firstName,lastName)=pair
    println(firstName)
    println(lastName)
}