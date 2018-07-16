package com.kot.basics

/*
Filter:
To filter out desired elements in collection
returns list containing elements matching given predicate

map:
To modify elements, to perform some operation
returns list of elements by applying given transform/function on each element in original list


Predicate:
It is a condition which returns TRUE/FALSE
e.g. all, any, count, find

flat map:
filter elements from collection of collections

distinct:
returns unique result

 */

fun main(args: Array<String>): Unit {
    val numList: List<Int> = listOf<Int>(3, 4, 6, 7, 34, 67, 32)
    //val smallNumList = numList.filter { num-> num < 10 }
    val smallNumList: List<Int> = numList.filter { it < 10 }
    println("Original list: $numList")
    println("Small filtered list: $smallNumList")

    val squaredNumbers: List<Int> = numList.map { it * it }
    println("Mapped to square: $squaredNumbers")

    val smallSquaredNumbers: List<Int> = numList.filter { it < 10 }.map { it * it }
    println("Small squared numbers: $smallSquaredNumbers")

    val peopleList = listOf<PersonData>(PersonData("A", 23), PersonData("B", 34), PersonData("Aa", 43), PersonData("K", 34))
    println("People list: $peopleList")
    //peopleList.flatMap { personData -> personData.name + " x" }

    val selectedPeople = peopleList.map { it.name }
    println("Selected people: $selectedPeople")

    val selectedNames = selectedPeople.filter { it.startsWith("A") }
    println("Selected Names: $selectedNames")
}

class PersonData(var name: String, var age: Int) {

}