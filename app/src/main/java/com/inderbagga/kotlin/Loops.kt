fun main(){

    val list=listOf(1,2,3,4,5)

    for(number in list) print(number)
    println()
    for(number in 6..14 step 3) print(number)
    println()
    for(number in 15 until 19 step 2) print(number)
    println()
    for(number in 25 downTo 20  step 2) print(number)
    println()
    for(index in list.indices) print(index)
    println()
    for((index,value) in list.withIndex())
        println("The value at index:$index is $value")

    var index=0
    while(index<10){
        index++
        print(index)
    }
    println()

    val listing=listOf("Paris","Ottawa","New York","London")

    listing.forEach{
        println(it)
    }

    listing.forEachIndexed{ index,value ->
        println("The value at index:$index is $value")
    }
}