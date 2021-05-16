fun main(){
    var numberList= mutableListOf("21","452","23","42","63","4695")

    //let scope function
    numberList.map { it.length }.filter { it>3 }.let { println(it) }

    val nullableString:String?="it can be null"

    //kotlin approach
    nullableString?.let { println(nullableString) }

    //java approach
    if(nullableString!=null) println(nullableString)

    //run scope function
    val info=Person("Sachin",41).run {
        address="Mumbai"
        getInfo()
    }
    println(info)

    //apply scope function
    var pInfo=Person("James",23).apply {
        address="england"
        phoneNumber=987654321
    }
    println(pInfo.toString())

    //also scope function
    var mappedList= mutableListOf("one","thirty","nine")
        .map { it.length }

    mappedList.also{ println("before $it") }
        .filter{ it>3 }.also { println("after $it") }
}