package com.kot.basics

/*
Predicates in Kotlin is a condition than returns TRUE/FALSE
all:
Do all elements satisfy the condition or predicate
Returns true/false accordingly

any:
Do any element in a list satisfy the given predicate
Returns true/false accordingly

count:
Total no of elements that satisfy the given condition/predicate

find:
First element that satisfy the predicate
 */

fun main(args: Array<String>): Unit {
    val list = listOf<Int>(4, 89, 34, 2, 0, 45, 67, 12, 33, 5, 8, 76)
    val numGreaterThan10: Boolean = list.all { it > 10 }
    println("Numbers greater than 10: $numGreaterThan10")

    val result: Boolean = list.any({num -> num > 10})
    println("Result of any: $result")

    val count: Int = list.count({it > 10})
    println("Count: $count")

    var num: Int? = list.find { it > 10 } // find returns nullable value, hence ? is appended at the end of datatype
    println("Num: $num")

    val myPredicate: (Int)->Boolean = {num: Int -> num > 10}
    num = list.findLast(myPredicate)
    println("Last num greater than 10: $num")
}