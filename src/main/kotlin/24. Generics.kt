fun main(){

    val objA=CustomType("String")
    val objB=CustomType(123)
    val objC=CustomType(listOf(1,2,3))

    //Variance with out
    val outClassObject=Out("String")
    val superTypeObject:Out<Any> =outClassObject

    //Variance with in
    val inClassObject: In<Number> = In()
    val subTypeObject : In<Int> = inClassObject
}

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