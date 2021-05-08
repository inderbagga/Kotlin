fun main(){

    val pair=Pair("Sachin","Tendulkar")
    val listPair=pair.toList()
    listPair.forEach { println(it) }
    println("${pair.first} ${pair.second}")
    val (firstName,lastName)=pair
    println(firstName)
    println(lastName)

    val triple=Triple("Elon","Musk","Tesla")
    val listTriple=triple.toList()
    listTriple.forEach { println(it) }
    println("${triple.first} ${triple.second} is the founder of ${triple.third}")
    val (fName,lName,companyName)=triple
    println("$fName $lName $companyName")
}