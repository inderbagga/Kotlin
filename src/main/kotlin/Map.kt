fun main(){

    val map= mapOf("IN" to "India","CA" to "Canada","UK" to "Britain")

    println(map.getOrDefault("US","Unknown"))
    println(map.containsKey("UK"))
    println(map.containsValue("India"))
    println(map.filter { it.key.contains("U") })
    println(map.filterNot { it.value == "India" })
    println(map["IN"])

    val ageMapper= mapOf(28 to "John", 32 to "Rishabh", 33 to "Inder")
    println(ageMapper.count())
    println(ageMapper.count{
        it.key>30
    })

    var dynamicMap= mutableMapOf(91 to "India",44 to "UK",1 to "US/Canada")
    dynamicMap[61] = "Australia"
    dynamicMap.remove(1)
    println(dynamicMap)
    println(dynamicMap.getOrElse(0) { "Undefined" })
}