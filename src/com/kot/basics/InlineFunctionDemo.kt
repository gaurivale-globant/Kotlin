package com.kot.basics

/*
Inline functions:
Disadvantages of higher order functions- runtime overhead, each function is object hence memory allocation
to function object and classes


Using higher-order functions imposes certain runtime penalties: each function is an object, and it captures a closure,
i.e. those variables that are accessed in the body of the function. Memory allocations (both for function objects and classes)
and virtual calls introduce runtime overhead.

Hence inline functions are used

Use "inline" keyword
Everything in inline function will be inlined at call site i.e. at function call
Avoid inlining large functions

By default lambda functions passed to inline function become inline
To avoid this use noinline modifier
 */

fun main(args: Array<String>) {
    testInline(){a: Int, b: Int->
        println("In lambda function")
         (a + b)
    }

    doSomeOperations({println("This is inline lambda")},
            {
                println("This is noinline lambda")
        for (i in 1..10) {
            println("i: $i")
        }
    })

}

inline fun testInline(action: (Int, Int)->Int) : Unit {
    println("this is inline function")
    var n: Int = action(6, 7)
    println("n: $n")
}

fun add(a: Int, b: Int): Int {
    return a + b
}

inline fun doSomeOperations(inlineFun: ()->Unit, noinline noInlineFun: ()->Unit): Unit {
    inlineFun()
    noInlineFun()
}