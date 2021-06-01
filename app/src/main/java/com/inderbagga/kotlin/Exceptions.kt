import java.lang.Exception

fun main(){

    val list= listOf(123,232)

    try{
        println(list[2])
    }catch (ex:Exception){
        println(ex)
    }

    try{
        val remainder=divideBy(0)
    }catch (ex:Fexception){
        println(ex)
    }
}

fun divideBy(divisor:Int){
    if(divisor==0) throw Fexception("Divisor can't be 0.")
    99/divisor
}

class Fexception(message:String):Exception(message)