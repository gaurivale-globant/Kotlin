package com.kot.basics

/*
Sealed classes:
Used for representing restricted class hierarchy
e.g. enum classes

sealed keyword is used to declare class as a sealed class
Sealed classes can have subclasses but all of them should be declared in same file

sealed class is abstract by default and it cannot be instantiated directly
it can have abstract methods
Constructors of sealed classes are private by default, non-private constructors are not allowed

sealed classes are useful when used with when expression

Sealed classes have same behavior as Enums
 */

sealed class SealedClassA {
    var a: Int = 8

    fun getAValue(): Int {
        println("In getAValue")
        return a
    }

    class InnerToSealedClassA {

    }
}

class B: SealedClassA() {
    fun bMethod() {
        println("A: $a")

        val n = getAValue()
        println("n: $n")
    }
    }


//sealed class example
/*
Restricted class hierarchy
Allowing datatype to be one of the predefined set of types
Behavior of sealed classes is like Enum classes
Instance of sealed class cannot be created

enum can have only one instance but subclass of sealed class can have multiple instances
Use enum for defining constants

sealed class can have abstract methods like enum
 */
sealed class Intention {
    class Refresh: Intention() {
        override fun log() {
            println("Refresh::log")
        }
    }
    class LoadMore: Intention() {
        override fun log() {
            println("LoadMore::log")
        }
    }

    abstract fun log()
}

fun main(args: Array<String>) {

    //Usage of sealed class
    val intention: Intention = Intention.Refresh()
    val output = when(intention) {
        is Intention.Refresh-> {
            intention.log()
            "Refresh class"
        }

        is Intention.LoadMore-> {
            intention.log()
            "LoadMore class"
        }
        //else case is not required
    }

    println("output is $output")


    var b: B = B()
    b.bMethod()

}