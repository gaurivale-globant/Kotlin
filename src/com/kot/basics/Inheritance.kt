package com.kot.basics

/*
By default all classes in Kotlin are public and final
In order to inherit any class in Kotlin, open keyword is used

 */
//class is made open as by default it is public and final
open class Animal {
    open var color: String = "White"

    constructor(color: String) {
        this.color = color
    }

    open fun eat() {
        println("Animal is eating")
    }
}

class Dog: Animal(color = "Brown")/*inheritance in Kotlin*/ {

    override var color: String = "Brown" // property overloading

    var breed: String = ""

    fun bark() {
        println("bark")
    }

    override fun eat() {
        super<Animal>.eat()
        println("Dog is eating")
    }
}

class Cat(color: String): Animal(color = "white") {
    var age: Int = -1
    fun mew() {
        println("mew")
    }

    constructor(color: String, age: Int): this(color) {
    }

    override fun eat() {
        //super.eat()
        println("Cat is eating")
    }
}

open class Test()/*default constructor with default value*/ {
constructor(name: String, id: Int = 123) : this(){

}

}

class A : Test {
    constructor(id: Int, name: String): super(name, id)/*call to primary constructor*/ {

    }
}

/*
In Kotlin, super/base/parent class of all classes is class named "Any" like Object class in Java
 */

/*
Types of inheritance:
1. Single inheritance class B->inherits from->class A
2. MultiLevel inheritance class C->inherits from->class B->inherits from->class A
3. Hierarchical inheritance class B->inherits from->class A, class C->inherits from->class A
 */

/*
Class Any contains default below methods in it:
1. toString
2. equals
3. hashCode


Inheritance: acquiring properties of parent class
1. Code reusability
2. method overriding
 */

fun main(args: Array<String>) {
    var dog: Dog = Dog()
    dog.color = "Black"
    dog.breed = "Labre"
    dog.eat()
    dog.bark()

    var cat: Cat = Cat("Cream")
    //cat.color = "Creame"
    cat.age = 5
    cat.eat()
    cat.mew()
    println("Cat color: ${cat.color}")

    var animal: Animal = Animal("Default")
    animal.color = "Default"
    animal.eat()

    var d: Dog = Dog()
    d.breed = "Labre"
    d.eat()
    d.bark()
    println("Dog color: ${d.color}")
}

//use super keyword to call parent class constructor