package com.kot.basics

//Named parameters feature is not available in Java, so Interoperability is not possible

fun main(args: Array<String>): Unit {
    printData(5, 6, 7)
    println()
    printData(a = 15, b = 16, c = 27)
    println()
    printData(c = 90, a = 56, b = 89)

    println()
    println()

    printData(p = 0, q = 1, r = 2)
    println()
    printData(r = 70, p = 41, q = 32)
}

fun printData(a: Int, b: Int, c: Int) {
    println("a: " + a)
    println("b: " + b)
    println("c: " + c)
}

fun printData(p: Int, q: Int, r: Int, s: Int = 25) {
    println("p: " + p)
    println("q: " + q)
    println("r: " + r)
    println("s: " + s)
}