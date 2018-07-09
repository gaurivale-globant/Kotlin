package com.kot.basics

//Singleton means only one instance of a class exists throughout the application
//Singleton class can be created using "object" keyword in Kotlin
//In Kotlin, we cannot create static variables, methods like Java


open class BaseOfA {
    open fun testMethod() {
        println("BaseOfA:testMethod")
    }
}

object ClassA : BaseOfA() { // Singleton class, "class" keyword is not used
    var id: Int = -1 // acting like static variable in Java

    fun generateId() {
        //This method also behaves like static method in Java as class is Singleton class as object keyword is used
        println("generateId method")
    }

    override fun testMethod() {
        super.testMethod()

        println("ClassA:testMethod")
    }

    init {
        //initialize code here
    }

}

//for object i.e. singleton class we cannot have constructor
// object supports inheritance

//singleton class can inherit other class as well

//object keyword creates instance of class as singleton, hence we cannot create instance of such class


fun main(args: Array<String>) {
    ClassA.id = 123
    println("Id: ${ClassA.id}")

    ClassA.generateId()

    ClassA.testMethod()

    println("Count: ${MyClass.count}") // call like static member of parent class
    println("Customer type: ${MyClass.getCustomerType()}") // call like static member of parent class

}

//companion objects are declared within a particular class


class MyClass {
    companion object /*CustomerData*/ { // class name is not required
        var count: Int = 100

        //@JvmStatic
        fun getCustomerType(): String {
            return "type_1"
        }
    }
}