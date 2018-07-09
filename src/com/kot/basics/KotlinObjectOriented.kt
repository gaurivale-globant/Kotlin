package com.kot.basics

class Customer(name: String){//This is primary constructor
// class name is called as class header
    //class body

    //Properties in Kotlin are called as field variables in Java
    //Primary constructor with property
    //primary constructor with parameters

    //e.g. property
    var name: String = "Anonymous"


    init {
        //init block for initializer code
        //this block is immediately executed after creation of instance of this class

        this.name = name
    }
}

//declaring property inside primary constructor with var keyword
class Sample(var name : String) { // or val name: String for immutable property
    init {
        println("Name is $name")
    }
}

class CollegeStudent constructor(var name: String) { // keyword constructor is optional if no other keyword is used there like @inject
    var id: Int = -1

    init {
        println("Student name is $name")
        println("Id: " + id)
    }

    //secondary constructor
    constructor(name: String, id: Int): this(name) /*call to primary constructor*/{
        //body
        //id in parameter is not part of class as a property or field as not declared as var
        //properties cannot be declared as a parameter in secondary constructor like primary constructor
        //var, val not allowed for parameters in secondary constructor

        this.id = id

        //body of secondary constructor is called after init block
    }
}

fun main(args: Array<String>) {
    //class instantiation
    var customer: Customer = Customer("abc") // new operator is not available in Kotlin, hence not used for object creation/constructor is called like this only like object
    println("Customer name: ${customer.name}")
    customer.name = "pqr"
    println("Cust name: ${customer.name}")

    var collegeStudent: CollegeStudent = CollegeStudent("ABCD")

    var sample: Sample = Sample("Test data")

    //call to secondary constructor
    var cs: CollegeStudent = CollegeStudent("KKKKK", 456)
    println("name: ${cs.name}, id: ${cs.id}")

}

//primary constructor doesn't have its own body
//Secondary constructors
