fun main(){

    val car=TataMotors()
    car.type().forEach {
        println("${car.manufacturer()} have $it cars in their ${car.buildYear()} portfolio.")
    }
}

interface Car{

    fun manufacturer():String
    fun type():List<String>
    fun buildYear()=2021
}

class TataMotors : Car{
    override fun manufacturer(): String ="Tata Motors"

    override fun type(): List<String> {
        return listOf("Luxury","Sedan","Hatchback","EV")
    }
}