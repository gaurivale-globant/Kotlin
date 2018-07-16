package com.kot.basics

fun main(args : Array<String>) : Unit {

    //REPL- Read Eval Print Loop
    //Tools->Kotlin->Kotlin REPL

    var age: Int = 20
    var test = 89

    test = 9
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

/*
Nothing-
Nothing has no instances
Nothing is used to indicate "value that never exists"
e.g. if function has return type Nothing, means it never returns, always throw an exception
 */

/*
Unit is a class which inherits from class Any with a single accepted value,
which is a singleton (to avoid memory allocation every time a function returns Unit).
 */

/*
Difference between Any and Nothing:-
val data = intent.getStringExtra("key") ?: fail()
textView.text = data
If fail() returns Nothing, the inferred type will be String.
If fail() returns Unit, the inferred type will be Any (and you’d get an error, because the TextView requires a CharSequence.

There can be no valid instance of Nothing at runtime

Nothing is subtype of every other type
Nothing? is subtype of every other nullable type
null is having type Nothing?
Nothing is value that never exists, no value at all


null:-
The null value is a special immutable atomic (structureless) value.
Its exact type is Nothing? (it is the only value of this type), and it also belongs to every nullable type,
usually indicating an absence of any valid value of the corresponding non-nullable type.

Unit is a real class with only one instance, Singleton
This is default return type

*/

/*
Kotlin is statically typed programming language
Runs on Java Virtual Machine
 */


//try to use sealed class
class SealedClassAccess /*: SealedClassA() //not allowed*/ {
    fun accessSealedClass() {
        //
        // var s: SealedClassA = SealedClassA() //access denied as private constructor

    }
}