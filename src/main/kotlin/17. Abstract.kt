fun main(){
    val mac=Mac()
    val windows=Windows()

    println(windows.operatingSystem())
    println(getInfo(mac))
}

fun getInfo(computer: Computer)="${computer.operatingSystem()} operating system is developed by ${computer.developedBy()}. It's a type of ${computer.category()}."

abstract class Computer(){
    abstract fun operatingSystem():String
    abstract fun developedBy():String
    open fun category():String="Software"
}

class Mac:Computer(){
    override fun operatingSystem(): String = "Mac"
    override fun developedBy(): String = "Apple"
}

class Windows:Computer(){
    override fun developedBy(): String = "Microsoft"
    override fun operatingSystem(): String = "Windows"
}

