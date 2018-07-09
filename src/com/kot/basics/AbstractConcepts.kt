package com.kot.basics

//Abstract classes, methods, properties
//by default all abstract methods in Kotlin are open
//abstract class is partially defined class

abstract /*open */class StudentEx { // by default abstract classes are open

    open var name: String = "Anonymous"
    abstract var id: Int // cannot be initialized being abstract

    open fun eat() {

    }

    fun gotoSchool() {

    }

    abstract fun playSports() //by default open, no body

}

class SchoolStudent: StudentEx() {

    override var name: String = "dummy_name"
    override var id: Int = -1 // here initialization is compulsory as it is overridden and abstract in base class

    override fun eat() {

    }

    override fun playSports() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main(args: Array<String>) {

    //var student: StudentEx = StudentEx() //instance of abstract class cannot be created

}