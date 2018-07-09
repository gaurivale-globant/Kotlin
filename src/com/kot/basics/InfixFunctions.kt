package com.kot.basics

/*
Infix function can be a member function or an extension function
Infix function has only single parameter
Infix function has prefix infix
All infix functions are extension functions
But all extension functions are not infix functions
Infix function increases readability
 */

fun main(args: Array<String>): Unit {
    var a: Int = 89
    var b: Int = 67
    var max: Int = a findGreaterValue b //infix function can be called in this fashion
    //same as a.findGreaterValue(b)
    println("Max num: $max")
}

infix fun Int.findGreaterValue(otherNum: Int): Int { // only one parameter hence infix function with prefix infix
    //this is extension function as well, part of Int class
    if (this > otherNum) return this else return otherNum
}
