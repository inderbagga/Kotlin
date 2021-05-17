fun main(){

    val objA=CustomType("String")
    val objB=CustomType(123)
    val objC=CustomType(listOf(1,2,3))
}

class CustomType<T>(value:T){
    init{
        println(" and length is ${value.toString().also { 
            print("the value is $it")
        }.length}")
    }
}