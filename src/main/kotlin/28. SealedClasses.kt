fun main(){

    var apple=Fruit.Apple()
    var mango=Fruit.Mango()
    var orange=Fruit.Orange()

    display(Fruit.Apple()).also {
        println(it)
    }

    val employee: AnEmployee  = SeniorDev("Name",20, 10)
    val message = when (employee) {
        is Manager -> {
            "Welcome ${employee.name}! You have ${employee.team.size} employees in your team!"
        }
        is SeniorDev -> {"Welcome ${employee.name}! You have already ${employee.projects} projects under your belt!"}
        //is is not required for SingleTon
        JuniorDev -> {"Welcome aboard! We wish you an awesome Experience!"}
        //no else case is required since all cases are handled
    }.let { println(it) }
}

//This is how we can have the state(name, age, and etc) in the sealed class which is not possible with enum.
sealed class AnEmployee
data class Manager(val name: String, val age: Int, val team: List<String>): AnEmployee()
class SeniorDev(val name: String, val age: Int, val projects: Int): AnEmployee()
object JuniorDev: AnEmployee()

/*enum class Result(val message: String) {
    SUCCESS("Success"),
    ERROR(val exception: Exception) // not possible with enums
}*/

sealed class Result
data class Success(val data: Data):Result()
data class Error(val exception: Exception) :Result()
data class Data(val id:Int, val type:String)

sealed class Fruit(val name:String){

    abstract fun display():String

    class Apple :Fruit("Apple"){
        override fun display()= super.name
    }

    class Mango : Fruit("Mango"){
        override fun display()= super.name
    }

    class Orange :Fruit("Orange"){
        override fun display()=super.name
    }
}

fun display(fruit:Fruit) : String{

    return when (fruit){
        is Fruit.Apple -> fruit.display()
        is Fruit.Mango -> fruit.display()
        is Fruit.Orange -> fruit.display()
    }
}