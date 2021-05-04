fun main(){

    val employeeA=Employee()
    val employeeB=Employee()

    println("The ${employeeA.displayName("Sucheta")}'s address is ${employeeA.toString()} ")
    println("The ${employeeB.displayName("Purti")}'s address is ${employeeB.toString()} ")

    println("The ${Employer.displayName("Google")}'s address is ${Employer.toString()} ")
    println("The ${Employer.displayName("Decathlon")}'s address is ${Employer.toString()} ")
}

class Employee(){

    fun displayName(name:String="Unknown"):String{
        return  name
    }
}

//Can't be instantiated or have a constructor
object Employer{

    fun displayName(name:String="ABC"):String{
        return name
    }
}