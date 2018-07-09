@file:JvmName("MyCustomKotlinClass") //Note: this should be the first line of a file, above package name

package com.kot.basics.kotlin

import com.kot.basics.java.MyJavaFile

fun main(args: Array<String>) : Unit {

    var area = MyJavaFile.areaOfRectangle(6, 7);
    println("Area of rectangle: $area")

}

fun add(a: Int, b: Int): Int {
    return a + b
}

/*
public class MyKotlinFileKt { //MyCustomKotlinClass

    public static void main(String[] args) {

    }

    public static int add(int a, int b) {
        return a + b;
    }

}
*/