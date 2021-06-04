package com.inderbagga.kotlin.equality

fun main(){

    val int1 = 10
    val int2 = 10

    println(int1 == int2)        // true
    println(int1.equals(int2))   // true
    println(int1 === int2)       // true, primitive datatype only checks the value in case of ===

    val first = Integer(10)
    val second = Integer(10)

    println(first == second)       //true, compares only values
    println(first.equals(second))  //true, compares only values
    println(first === second)      //false, compares the references of the objects

    //As Empoyee is not a primitive datatype or wrapper class,
    class ExtraEmployee (val name: String)
    val emp1 = ExtraEmployee("Sakshi")
    val emp2 = ExtraEmployee("Sakshi")

    //all three compared the references, which returns false for all three checks.
    println(emp1 == emp2)      //false
    println(emp1.equals(emp2)) //false
    println(emp1 === emp2)     //false

    //In case of string comparison, it only checks the contents of the string which are equal so it returns true for all.
    println(emp1.name == emp2.name)       //true
    println(emp1.name.equals(emp2.name))  //true
    println(emp1.name === emp2.name)      //true


    /*For == and .equals, the content comparison only works if its a data class.
      If it’s a normal class the compiler consider both the objects as different objects even if the content is same
      but if its a data class, the compiler compares the data and return true if the content is same.*/
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

