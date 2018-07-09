package com.kot.basics

//for data classes copy() method is provided along with toString, equals, hashCode of Any class

fun main(args: Array<String>) {
    var user1: User = User("A", 101)
    var user2: User = User("A", 101)

    if (user1 == user2) { // when declared as data class then these two become equal
        println("user1 and user2 are equal")
    } else {
        println("user1 and user2 are NOT equal")
    }
    var user3: User = User("B", 201)
    println("user3: " + user3)
    println("user3: $user3")
    println("user3: " + user3.toString())

    var newUser: User = user3.copy();
    println("newUser: " + newUser)

    newUser = user3.copy("BBB")
    println("newUser: " + newUser)

    newUser = user3.copy(name = "OOO")
    println("newUser: " + newUser)

    newUser = user3.copy(id = 123)
    println("newUser: " + newUser)

    println("user3: " + user3)
}

data class User(var name: String, var id: Int) {
//Note: in case of data classes, the primary constructor should only contain property variables i.e. var, val
}