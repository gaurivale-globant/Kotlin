package com.kot.basics

/*
Collections in Kotlin:
1. Arrays in Kotlin:-
class name is Array, are mutable in nature but has fix size
Array is collection of elements

Immutable Collections-- Read only


Mutable Collections-- Read and Write allowed


 */

fun main(args: Array<String>): Unit {
    //Array demo:
    //var arr: Array<Int> = Array<Int>(5, {0})// param1= array size, param2= initial value of all elements in array, default value
    var arr: Array<Int> = Array<Int>(5) {0} // both are same, just 2nd lambda parameter is moved outside
    // Index:-      0 1 2 3 4
    // Elements:-   0 0 0 0 0
    //values present inside an array can be changed hence mutable
    arr[0] = 800
    arr[2] = 456

    println(arr[2])
    println(arr)

    //for each loop to print all elements
    for (element in arr) {
        println(element)
    }

    //arr[9] = 56 //will throw ArrayIndexOutOfBoundsException

    for (index in 0..4) {
        println("$index : ${arr[index]}")
    }

    for (index in 0..arr.size - 1) {
        println("$index : ${arr[index]}")
    }

    /*
    List:-
    Two types- Mutable, Immutable
    listOf= This will provide immutable list, this list is immutable, fixed size and read only
    List has same indexing like Array
     */
    var list: List<String> = listOf<String>()
    println(list)
    list = listOf<String>("A", "B", "C")
    println(list)
    //list[2] = "fdsf" //not allowed

    for (element in list) {
        println(element)
    }

    for (index in 0.. list.size - 1) {
        println("$index : ${list[index]}")
        println("$index :- ${list.get(index)}")
    }

    /*
    Mutable lists can be created by below options:
    ArrayList, arrayListOf, mutableListOf
    It is mutable, does NOT have fix size, and read/write operations are allowed in it like add/remove
     */
    var mutableList: MutableList<String> = mutableListOf<String>("a", "b", "c")
    println("Original list: $mutableList")

    mutableList.add("d")
    println("List after add: $mutableList")

    mutableList.add(1, "e")
    println("List after add at index: $mutableList")

    mutableList.remove("c")
    println("List after remove: $mutableList")

    mutableList.removeAt(2)
    println("List after remove at index: $mutableList")

    mutableList[0] = "j"
    println("List after set element at index: $mutableList")

    var mutableList1: ArrayList<String> = ArrayList<String>()
    mutableList1.add("1")
    mutableList1.add("2")
    mutableList1.add("3")
    mutableList1.add("4")
    println("Mutable list by ArrayList constructor: $mutableList1")

    var mutableList2: ArrayList<String> = arrayListOf<String>()
    mutableList2.add("%")
    mutableList2.add("@")
    mutableList2.add("#")
    println("Mutable list by arrayListOf method: $mutableList2")
}