package com.kot.basics

fun main(args : Array<String>) : Unit {
    //For loop
    for (i in 1..5) { //both 1 and 5 are inclusive
        println("For loop: i=$i")
    }

    //while loop
    var i = 1
    while (i < 5) {
        println("while loop: i=$i")
        i++
    }

    //do-while loop
    var x = 0
    do {
        println("do-while loop: x=$x")
        x++
    } while(x < 5)


    //break
    //labeled for loop
    outerLoop@ for (i in 1..4) {
        for (j in 1..4) {
            println("$i $j")
            if (i == 2 && j == 2) {
                break@outerLoop
            }
        }
    }

    println("Continue************")

    //continue
    outerLoop@ for (i in 1..4) {
        for (j in 1..4) {

            if (i == 2 && j == 2) {
                continue@outerLoop
            }

            println("$i $j")
        }
    }

    //return

    var ints: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    ints.forEach {
        if (it % 2 == 0) {
            println("even")
        } else {
            println("odd")
        }
    }
}