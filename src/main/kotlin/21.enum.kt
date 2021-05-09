fun main(){
    val teacher=Teacher("Ray",Gender.MALE)

    for(item in Gender.values()){
        println("${item.name} with id ${item.id} is at ${item.ordinal} position with ${item.value} value.")
    }
}

class Teacher(name:String,gender:Gender){
    init{
        println("$name is a ${gender.value}")
    }
}

enum class Gender(val value:String,val id:Int){
    MALE("male",1),
    FEMALE("female",2)
}