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

/*
"return" statement can be used in normal named function and in anonymous function to exit function.
It cannot be used in lambda expression. Because lambda cannot make enclosing function return.
To exit from lambda label is used.
For inline function return is allowed

If lambda returns enclosing function then it is called as non-local return
 */
