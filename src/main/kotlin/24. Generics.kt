fun main(){

    val objA=CustomType("String")
    val objB=CustomType(123)
    val objC=CustomType(listOf(1,2,3))

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


//Contra-Variance
class Chair : Furniture() {}
open class Furniture {}
class Container<in T>

//Co-Variance
class MyClass<T>
class AnotherClass<out T>

class CustomType<T>(value:T){
    init{
        println(" and length is ${value.toString().also {
            print("the value is $it")
        }.length}")
    }
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