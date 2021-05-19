fun main(){

    //Kotlin program of lambda expression which returns Unit
    var le1={ println("this is it!")}
    hoFun1(le1)

    //Kotlin program of lambda expression which returns Integer value
    hoFun2{
        a:Int,b:Int -> a+b
    }

    //Kotlin program of passing function which returns Unit
    hoFun3("Exciting",::printString)

    //Kotlin program of passing function which returns Integer value
    hoFun4(3,4,::plusNumbers)

    //Kotlin program of a function returning another function
    val add=hoFun5()
    println(add(45,67))

}
//==========
fun addNumbers(a: Int, b: Int): Int{
    return a+b
}

fun hoFun5():(Int,Int)->(Int){
    return ::addNumbers
}
//==========
fun hoFun4(a:Int,b:Int,func:(Int,Int) ->Int){
    val sum=func(a,b)
    println(sum)
}

fun plusNumbers(a:Int,b:Int) :Int{
    return a+b
}
//==========
fun hoFun3(str:String,func:(String)-> (Unit)){
    func(str)
}

fun printString(string:String):Unit{
    println(string)
}
//==========
fun hoFun2(le:(Int,Int) -> Int){
    var result=le(3,6)
    println(result)
}
//==========
fun hoFun1(le:()->(Unit)){
    le()
}
//==========