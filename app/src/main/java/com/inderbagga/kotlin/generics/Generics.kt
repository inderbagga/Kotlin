package com.inderbagga.kotlin.generics

fun main(){

    val objA=CustomType("Generics")
    val objB=CustomType(123)
    val objC=CustomType(listOf(1,2,3))
}

class CustomType<T>(value:T){
    init{

        when(value){

            is String -> println(" and String length is ${value.toString().also {
                print("String value is $it")
            }.length}")

            is Int -> println(" and Integer length is ${value.toString().also {
                print("Integer value is $it")
            }.length}")

            is List<*> -> println(" and List size is ${value.also {
                print("List value is $it")
            }.size}")
        }

    }
}