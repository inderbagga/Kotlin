fun main(){

    val setA=setOf("UK","Chandigarh","Delhi","Texas","US")
    val setB=setOf("Japan","Australia","India","UK")

    println(setA.distinct())

    val mSetA= mutableSetOf("UK","Chandigarh","Delhi","Texas","US")
    val mSetB= mutableSetOf("Japan","Australia","India","UK")

    val mSetC= setA union setB
    val mSetD= setA intersect  setB
    val mSetE= setA to setB

    println(mSetA)
    println(mSetB)
    println(mSetC)
    println(mSetD)
    println(mSetE)
}