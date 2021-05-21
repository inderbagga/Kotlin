import java.util.*

data class Event @JvmOverloads constructor(val name:String,@JvmField val date:Date=Date())

object Utils{
    @JvmStatic
    fun display():String="display from utils!"
}

fun main(){

    println(Utils.display())
    val event=Event("Unity")
    println("${event.name} is on ${event.date}")
}
