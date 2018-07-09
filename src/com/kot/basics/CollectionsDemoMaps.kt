package com.kot.basics

/*
Maps:
Map is a data structure for key-value pairs
Immutable- mapOf
Mutable- HashMap, hashMapOf, mutableMapOf
 */

fun main(args: Array<String>): Unit {

    var immutableMap: Map<Int, String> = mapOf<Int, String>(1 to "A", 2 to "B", 3 to "C", 4 to "D") //Immutable, read only and fixed size map
    println("Immutable map: $immutableMap")

    for (key in immutableMap.keys) {
        println("$key : ${immutableMap.get(key)}")

        println(immutableMap[key])
    }

    var mutableMap: HashMap<Int, String> = HashMap<Int, String>() //Mutable, read and write operations can be performed, NOT having fix size
    mutableMap.put(100, "a")
    mutableMap.put(200, "b")
    mutableMap.put(300, "c")
    println("Mutable map by HashMap: $mutableMap")

    mutableMap.replace(200, "d")
    println("Mutable map after replace call: $mutableMap")

    var mutableMap1: HashMap<Int, String> = hashMapOf<Int, String>()
    mutableMap1.put(10, "Aa")
    mutableMap1.put(20, "Bb")
    println("Mutable map by hashMapOf: $mutableMap1")

    var mutableMap2: MutableMap<Int, String> = mutableMapOf<Int, String>() // returns LinkedHashMap
    mutableMap2.put(100, "aaa")
    mutableMap2.put(200, "bbb")
    mutableMap2.put(300, "ccc")
    println("Mutable map by mutableMapOf: $mutableMap2")

}