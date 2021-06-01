package com.inderbagga.kotlin.generics

fun main(){

    var typeInt=arrayOf(1, 2, 3)
    var typeAny=Array<Any>(3) { "" }

    //Type Projection
    copy(typeInt,typeAny)

    typeAny.forEach {
        println(it)
    }

    //Star Projection
    printArray(listOf(14,21,32))
}

//Star Projection
fun printArray(list:List<*>){
    list.forEach { println(it) }
}

//Type Projection
fun copy(from:Array<out Any>,to:Array<Any>){

    assert(from.size==to.size)

    for(i in from.indices){
        to[i]=from[i]
    }
}