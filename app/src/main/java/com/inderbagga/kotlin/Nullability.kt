package com.inderbagga.kotlin.npe

fun main(){

    var cityName:String? ="Denver"
    println(cityName)
    cityName=null

    if(cityName!=null){
    }else println("null")

    //Safe call operator
    println(cityName?.length)

    if(cityName?.length!=null){
        println(cityName.length)
    }else println(0)

    //Elvis Operator
    println(cityName?.length?:0)

    cityName="Non Null"

    //Not-null assertion operator converts any value to a non-null type
    println(cityName!!.length)

    val nullableList: List<Int?> = listOf(1, 2, null, 4)
    val intList: List<Int> = nullableList.filterNotNull()
    for (item in nullableList) {
        item?.let { println(it) } // prints Kotlin and ignores null
    }
    print(nullableList.toString())
    println()
    print(intList.toString())
}