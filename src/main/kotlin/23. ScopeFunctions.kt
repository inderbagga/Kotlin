fun main(){
    var numberList= mutableListOf("21","452","23","42","63","4695")
    val person: Person = Person("Dhoni",38)

    println("let scope function")
    numberList.map { it.length }.filter { it>3 }.let { println(it) }

    val nullableString:String?="it can't be null"

    //kotlin approach
    nullableString?.let { println(nullableString) }

    //java approach
    if(nullableString!=null) println(nullableString)

    println("\nrun scope function")
    val info=person.run {
        address="Mumbai"
        getInfo()
    }
    println(info)

    println("\nwith scope function")
    val numbers = mutableListOf("one", "two", "three")
    val firstAndLast = with(numbers) {
        "The first element is ${first()}," +
                " the last element is ${last()}"
    }
    println(firstAndLast)

    val data=with(person){
        this.phoneNumber=876
        this.name = "Ricky"
        this.address = "Australia"
        this.getInfo()
    }

    println("data is $data")

    println("\napply scope function")
    var pInfo=Person("James",23).apply {
        address="england"
        phoneNumber=987654321
    }
    println(pInfo.toString())

    println("\nalso scope function")
    var mappedList= mutableListOf("one","thirty","nine")
        .map { it.length }

    mappedList.also{ println("before $it") }
        .filter{ it>3 }.also { println("after $it") }
}