fun main(){

    val array= arrayOf(1,43,4.56,'B',true,"Hallo")
    println(array.contentToString())

    val intArray= intArrayOf(1,2,34,55,2,56,5)
    println(intArray.contentToString())
    println(intArray.sortedArray().contentToString())
    println(intArray.sortedArrayDescending().contentToString())
    println("max is: ${intArray.maxOrNull()}")
    println("min is: ${intArray.minOrNull()}")

    intArray[1] = 43
    println(intArray.contentToString())

    val findMultipleOf5=intArray.find { it%5==0 }
    println(findMultipleOf5)

    val shortArray= shortArrayOf(122,23,245)
    val longArray= longArrayOf(1223,2432,2343)
    val boolArray= booleanArrayOf(true,false)

    println("average value is: ${shortArray.average()}")
}