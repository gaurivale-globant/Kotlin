package com.kot.basics

class Person(var name : String) {

    fun display() {
        println("The name of person is " + name)

        println("The name of person is ${name}")
    }

}