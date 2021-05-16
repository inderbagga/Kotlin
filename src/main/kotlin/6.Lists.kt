fun main(){

    val list=listOf(1,2,3,4,5,"Greta")
    val intList= listOf(1,5,7,6,2,4)
    val floatList= listOf(23.43,56,66,7,54,6.7,.5)

    println(list.last())
    println(intList.take(2))
    println(floatList.takeLast(4))
    println(intList.sorted())
    println(intList.sortedDescending())
    println( intList.findLast { it%2==0 })
    println(intList.filter { it%2!=0 })
    println( intList.map { it*it })
    println(intList.sum())
    println(intList.slice(2..4))
    println(intList.subList(2,4))

    var dynamicList= mutableListOf(1,2,3,true)
    var dynamicIntList= mutableListOf<Int>(1,2,3,4,5)
    var personList= mutableListOf<Person>()

    println(dynamicIntList.maxOrNull())
    println(dynamicIntList.removeAt(3))
    println(dynamicIntList.remove(3))
    println(dynamicIntList.add(34))
    println(dynamicIntList.add(2,56))
    println(dynamicIntList.removeFirstOrNull())
    println(dynamicIntList.set(2,42))
    println(dynamicIntList.toString())

    personList.add(Person("John",31))
    personList.add(Person("Rishabh",33))
    personList.add(Person("Sandy",32))

    personList.asReversed().forEach { println("${it.name} is ${it.age} years old!") }
    println(personList.sumOf { it.age })
    personList.sortBy { it.age }.also { println(personList.toString()) }

    val iList:List<Int>
}

data class Person(val name:String,val age:Int){

    var address="undefined"

    var phoneNumber=0

    fun getInfo():String="$name of age $age resides in $address"

    override fun toString(): String {
        return "$name can be called on $phoneNumber"
    }
}