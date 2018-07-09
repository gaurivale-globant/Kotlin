package com.kot.basics.java;

import com.kot.basics.DefaultFunctionsKt;
import com.kot.basics.kotlin.MyCustomKotlinClass;

public class MyJavaFile {

    public static void main(String[] args) {
        //int sum = MyKotlinFileKt.add(4, 6);
        int sum = MyCustomKotlinClass.add(7, 3);
        System.out.println("Sum: " + sum);

        //Java doesn't have default functions, hence only two arguments cannot be passed
        //int volume = DefaultFunctionsKt.findVolume(4, 5); // this gives error
        //Annotation JvmOverloads is used for below method in Kotlin file
        int volume = DefaultFunctionsKt.findVolume(4, 5);
        System.out.println("Volume: " + volume);

        volume = DefaultFunctionsKt.findVolume(2, 3, 4);
        System.out.println("Volume of 2, 3, 4 is : " + volume);

    }

    public static int areaOfRectangle(int length, int breadth) {
        return length * breadth;
    }

}
