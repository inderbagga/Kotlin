package com.inderbagga.kotlin.properties

fun main(){

    Main().apply {
        selectedColor=123
    }
}

class Main{

    var selectedColor: Int = 124
        get() = field
        set(value) {
            field = value
            doPrint(value)
        }
}

private fun doPrint(selectedColor: Int) = println("The selected color is :$selectedColor")


