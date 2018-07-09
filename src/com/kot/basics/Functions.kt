package com.kot.basics

fun main(args : Array<String>) {

    var area = area(4, 5)
    println("Area: $area")

    var maxVal = max(45, 27)
    println("Max value is $maxVal")
}

fun area(length: Int, breadth: Int) : Int {
    return length * breadth
}

//Unit datatype is equivalent to void in java

//function as a expression

fun max(a: Int, b: Int) : Int
        = if (a > b) {
            println("$a is greater")
            a
            //80 -- last statement will be returned
        } else {
            println("$b is greater")
            b
        }