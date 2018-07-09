package com.kot.basics

/*
Collections:
Sets:
Set contains unique elements.
In HashSet, sequence of inserted elements is not guaranteed in output

Immutable Set:-
Read only

Mutable Set:-
read, write both allowed
 */

fun main(args: Array<String>): Unit {
    var immutableSet: Set<Int> = setOf<Int>(3, 4, 5, 6, 6, 8 , 0, 4, 0, 56, 78) // Read only
    println("Immutable set: $immutableSet")

    for (element in immutableSet) {
        println(element)
    }

    var mutableSet: MutableSet<Int> = mutableSetOf<Int>(1, 2, 3, 2) // sequence of inserted elements remain as it is
    println("Mutable set by mutableSetOf: $mutableSet")

    mutableSet.add(5)
    println("Mutable set after add: $mutableSet")

    mutableSet.remove(3)
    println("Mutable set after remove: $mutableSet")

    var mutableSet1: HashSet<Int> = HashSet<Int>() // sequence of inserted elements is not guaranteed
    mutableSet1.addAll(immutableSet)
    println("Mutable set by HashSet: $mutableSet1")

    var mutableSet2: HashSet<Int> = hashSetOf<Int>(78, 9, 23, 45) // sequence of inserted elements is not guaranteed
    mutableSet2.addAll(immutableSet)
    println("Mutable set by hashSetOf: $mutableSet2")
}