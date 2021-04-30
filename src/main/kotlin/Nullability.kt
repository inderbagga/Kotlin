fun main(){

    var cityName:String? ="Denver"
    println(cityName)
    cityName=null

    if(cityName!=null){
    }else println("null")

    println(cityName?.length)

    if(cityName?.length!=null){
        println(cityName.length)
    }else println(0)

    println("Using Elvis Operator")
    println(cityName?.length?:0)
}