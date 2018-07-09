package com.kot.basics

/*
public
protected -- not applicable to high/top level functions and classes
internal -- visible within same module, module is e.g. maven, groovy, intelliJ
private

by default everything is public in Kotlin
all top level functions, classes are by default public in nature
 */

open class PersonEx {
    private val a = 1
    protected val b = 2
    internal val c = 4
    public val  d = 9
}

class Indian : PersonEx() {
    //a not visible in this class
    //b, c, d are visible

    fun test() {
        //println("a: " + a)
        println("b: $b")
        println("c: $c")
        println("d: $d")
    }
}

class TestClass {
    fun testing() {
        var person: PersonEx = PersonEx()
        //a, b are not accessible here
        println("c=${person.c}")
        println("d=${person.d}")
    }
}