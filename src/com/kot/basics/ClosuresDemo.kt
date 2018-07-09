package com.kot.basics

/*
In Java 8, you cannot change/mutate values of variables which are outside of lambda in lambda expression/function
But in Kotlin you can change it
 */

/*
it = It is implicit name of single parameter while using lambdas
This keyword can be used in lambda expressions having only one parameter
 */

fun main(args: Array<String>): Unit {
    var result: Int = 0
    var obj: ClosuresDemoOp = ClosuresDemoOp()
    obj.add(2,
            3,
            {a, b->
                result = a + b
                println("Result is: $result")
            })

    println("Result: $result")

    obj.reverseAndDisplay("Hello Kotlin", {s -> s.reversed() })

    obj.reverseAndDisplay("Hello World") {it.reversed()} // same as above function call with "it" operator for single parameter
    obj.reverseAndDisplay("Hello World", {it.reversed()}) // same as above function call with "it" operator for single parameter


    var emp1: Employee = Employee()
    emp1.name = "A"
    emp1.age = 23
    println("Name: ${emp1.name}, Age: ${emp1.age}")

    /*
    with operator/keyword with lambda
    "with" keyword is part of Kotlin standard library, not Kotlin language
     */

    with(emp1) {
        emp1.name = "B"
        emp1.age = 26
    }
    println("Name: ${emp1.name}, Age: ${emp1.age}")

    with(emp1) {
        name = "C"
        age = 20
    }
    println("Name: ${emp1.name}, Age: ${emp1.age}")

    /*
    "apply" keyword is also part of Kotlin standard library
    "apply" returns a receiver but "with" operator doesnot.
     */
    emp1.apply {
        name = "D"
        age = 56
    }.startRun()
    println("Name: ${emp1.name}, Age: ${emp1.age}")

    var emp2: Employee = emp1.apply {
        age = 34
        name = "E"
    }
    println("Emp1:: Name: ${emp1.name}, Age: ${emp1.age}")
    println("Emp2:: Name: ${emp2.name}, Age: ${emp2.age}")
    emp2.startRun()

}

class ClosuresDemoOp {
    fun add(a: Int, b: Int, action: (Int, Int)->Unit): Unit {
        action(a, b)
    }

    fun reverseAndDisplay(str: String, myFunc : (String)->String) {
        var result = myFunc(str)
        println("Reversed string: $result")
    }

}

class Employee {
    var name: String = "Anonymous"
    var age: Int = 18

    fun startRun(): Unit {
        println("Initialization of employee object is done.")
    }
}