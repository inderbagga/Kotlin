import java.lang.Exception

fun main(){

    val list= listOf(123,232)

    try{
        println(list[2])
    }catch (ex:Exception){
        println(ex)
    }
}