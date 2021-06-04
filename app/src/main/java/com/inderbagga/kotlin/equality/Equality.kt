package com.inderbagga.kotlin.equality

fun main(){

    val int1 = 10
    val int2 = 10

    println(int1 == int2)        // true
    println(int1.equals(int2))   // true
    println(int1 === int2)       // true because primitive datatype only checks the value in case of ===, which will be equal in this case.

    val first = Integer(10)
    val second = Integer(10)

    println(first == second)       //true
    println(first.equals(second))  //true
    println(first === second)      //false
    //In the above case, the == and .equals prints true because they compare only values whereas === compares the references of the objects which were different so it prints false.

    class ExtraEmployee (val name: String)
    val emp1 = ExtraEmployee("Sakshi")
    val emp2 = ExtraEmployee("Sakshi")

    println(emp1 == emp2)      //false
    println(emp1.equals(emp2)) //false
    println(emp1 === emp2)     //false

    println(emp1.name == emp2.name)       //true
    println(emp1.name.equals(emp2.name))  //true
    println(emp1.name === emp2.name)      //true

    //The reason for the above comparison is obvious, As Empoyee is not a primitive datatype or wrapper class, all three compared the references, which returns false for all three checks. But in the case of string comparison, if only checks the contents of the string which were equal so it returns true for every case.

    //For == and .equals, the content comparison only works if its a data class. If it’s a normal class the compiler consider both the objects as the different objects even if the content is same but if its a data class, the compiler compares the data and return true if the content is same.
    data class DEmployee (val name: String)
    val demp1 = DEmployee("Sakshi")
    val demp2 = DEmployee("Sakshi")

    println(demp1 == demp2)         //true
    println(demp1.equals(demp2))    //true
    println(demp1 === demp2)        //false

    println(demp1.name == demp2.name)      //true
    println(demp1.name.equals(demp2.name)) //true
    println(demp1.name === demp2.name)     //true

    val negZero = -0.0f
    val posZero = 0.0f

    println(negZero == posZero)         //true
    println(negZero.equals(posZero))    //false
    println(negZero === posZero)        //true

}

