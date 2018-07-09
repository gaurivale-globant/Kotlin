package com.kot.basics

fun main(args: Array<String>): Unit {
    var volume = findVolume(4, 5)
    println("Volume: $volume")

    volume = findVolume(2, 3, 4) // overriding default value
    println("Volume: $volume")
}

//Can we call default function from Java file? use annotation JvmOverloads for making default function compatible with Java
@JvmOverloads
fun findVolume(length: Int, breadth: Int, depth: Int = 12): Int {
    return length * breadth * depth
}

