package com.kot.basics

fun main(args: Array<String>) : Unit {
    //if as a expression
    val a = 8
    val b = 3
    var max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }

    println("max $max")

    max = if (a > b) a else b
    println("max $max")

    max = if (a > b) {
        println("a is greater")
        a
    } else {
        println("b is greater")
        b
    }

    println("max is $max")

    //when as a expression -- like switch case
    var x = 7
    when (x) {
        0, 1-> println("x is 0 or 1")
        2-> {println("x is 2")}
        3-> println("x is 3")
        4-> println("x is 4")
        in 5..13 -> println("in range of 5 to 13")
        else -> println("x is out of range")
    }

    x = 45
    var output : String = when (x) {
        0, 1-> "x is 0 or 1"
        2-> "x is 2"
        3-> "x is 3"
        4-> "x is 4"
        in 5..13 -> "in range of 5 to 13"
        else -> {
            "x is out of range"
            "x is unknown" // statement at the end of code block is returned
        }
    }

    println("output: $output")

}