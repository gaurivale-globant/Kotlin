package com.kot.basics

import java.math.BigInteger

//TailRec functions are recursive functions
//These functions use recursion in more optimized way
//Prevents stackoverflow exception

fun main(args: Array<String>): Unit {
    //stackoverflow error us thrown by below call if tailrec is not used
    //if tailrec keyword is used as prefix then stackoverflow error will not occur for huge recursions
    //why?- In Kotlin without affecting stack memory, internally this function is executed
    //It saves memory and hence application runs smoothly without failing
    println(getNthFibonacciNumber(10000, BigInteger("0"), BigInteger("1")))

}

tailrec fun getNthFibonacciNumber(n: Int, num1: BigInteger, num2: BigInteger): BigInteger {
    if (n == 0) {
        return num2
    } else {
        return getNthFibonacciNumber(n - 1, num1 + num2, num1)
    }

}