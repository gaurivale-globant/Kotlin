package com.kot.basics

//Meaning:
// 1. is to add a new function to an existing class without declaring it in that class, can be part of predefined/in built classes or your custom classes
// 2. This new function behaves like static functions in java

fun main (args: Array<String>) {
    var student: Student = Student()
    println("Is passed: ${student.isPassed(56)}")
    println("Is scholar: ${student.isScholar(98)}")

    var s1: String = "Hi "
    var s2: String = "Kotlin"
    println("String extension: ${"Hey, ".add(s1, s2)}")
}

fun String.add(s1: String, s2: String): String {
    return this + s1 + s2;
}

//extension function
fun Student.isScholar(marks: Int): Boolean {
    return marks > 90
}

class Student {

    fun isPassed(marks: Int) : Boolean {
        return marks > 40
    }

}