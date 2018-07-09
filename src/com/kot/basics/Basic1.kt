package com.kot.basics

fun main(args : Array<String>) : Unit {

    //REPL- Read Eval Print Loop
    //Tools->Kotlin->Kotlin REPL

    var age: Int = 20
    var test = 89

    var isAlive: Boolean = true
    var isDead = false //inline initialization

    //var is mutable
    //val is immutable- constant

    val name = "Gauri"
    val greet = "Welcome " + name
    println(greet)

    val greetWithStringInterpolation = "Welcome $name"
    println(greetWithStringInterpolation)
    println("Length of string is ${greetWithStringInterpolation.length}")

    val a = 30
    val b = 20
    println("Sum of $a and $b is ${a + b}")

    //Ranges

    val r1 = 1..5
    val r2 = 5 downTo 1
    val r3 = 5 downTo 1 step 2
    val r4 = 1..15 step 3
    val r5 = "a".."p"
    val r6 = 'a'..'g'
    var isPresent = 'a' in r6
    println("Is a present in r6 $isPresent")
    isPresent = "t" in r5
    println("Is t present in r5 $isPresent")
    isPresent = 3 in r1
    println("Is 3 in r1 " + isPresent)

    var n = 10.downTo(1)
    var n1 = 5.rangeTo(25)

}