fun main(){
    val teacher=Teacher("Ray",Gender.MALE)

    for(item in Gender.values()){
        println("${item.name} with id ${item.id} is at ${item.ordinal} position with ${item.value} value.")
    }

    val color=Cards.Diamond.color
    println(color)

    // A simple demonstration of properties and methods
    for(day in DAYS.values()) {
        println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekend}")
    }
    val today = DAYS.FRIDAY;
    println("Is today a weekend ${DAYS.today(today)}")

    Seasons.Summer.foo()

    when(DAYS.SUNDAY){
        DAYS.SUNDAY -> println("Today is Sunday")
        DAYS.MONDAY -> println("Today is Monday")
        DAYS.TUESDAY -> println("Today is Tuesday")
        DAYS.WEDNESDAY -> println("Today is Wednesday")
        DAYS.THURSDAY -> println("Today is Thursday")
        DAYS.FRIDAY -> println("Today is Friday")
        DAYS.SATURDAY -> println("Today is Saturday")
        // Adding an else clause will generate a warning
        else -> println("Not required!")
    }
}

class Teacher(name:String,gender:Gender){
    init{
        println("$name is a ${gender.value}")
    }
}

enum class Seasons(var weather: String) {
    Summer("hot"){
        // compile time error if not override the function foo()
        override fun foo() {
            println("Hot days of a year")
        }
    },
    Winter("cold"){
        override fun foo() {
            println("Cold days of a year")
        }
    },
    Rainy("moderate"){
        override fun foo() {
            println("Rainy days of a year")
        }
    };
    abstract fun foo()
}

enum class Gender(val value:String,val id:Int){
    MALE("male",1),
    FEMALE("female",2)
}

enum class DAYS(val isWeekend: Boolean = false){
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY(true);

    companion object{
        fun today(obj: DAYS): Boolean {
            return obj.name.compareTo("SATURDAY") == 0 || obj.name.compareTo("SUNDAY") == 0
        }
    }
}

enum class Cards(val color: String) {
    Diamond("black"),
    Heart("red"),
}