package com.inderbagga.kotlin.generics

fun main(){

    //Variance with out
    val outClassObject:Out<String> =Out("String")
    val superTypeObject:Out<Any> =outClassObject

    //Variance with in
    val inClassObject: In<Number> = In()
    val subTypeObject : In<Int> = inClassObject

    //Co-Variance
    val coSubType:MyClass<out Any> =MyClass<String>() //String is a subtype of Any
    val anotherCoSubType:AnotherClass<Any> =AnotherClass<String>() //String is a subtype of Any

    //Contra-Variance
    var contraObject:Container<Chair> =Container<Furniture>()//Furniture is a supertype of Chair
}


class Out<out T>(private val value: T){

    fun get():T{
        return value
    }
}

class In<in T>{
    fun toString(value:T):String{
        return value.toString()
    }
}

//=======================================================================================================
//Contra-Variance
class Chair : Furniture() {}
open class Furniture {}
class Container<in T>

//Co-Variance
class MyClass<T>
class AnotherClass<out T>