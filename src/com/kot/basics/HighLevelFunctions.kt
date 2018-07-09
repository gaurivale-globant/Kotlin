package com.kot.basics

/*
High Level Functions:
These are the functions which accept function as a parameter.
From a function, a function can be returned.

Lambdas:
These are functions without name.
 */


fun main(args: Array<String>) {

    var obj: MathOp = MathOp()
    obj.add(
            5,
            3,
            object : OpExecutor { // this is like singleton anonymous
                override fun execute(sum: Int) {
                    println("Sum: $sum")
                }
            }
    ) // add method ends

    val myLambda = {num: Int -> println("num: $num")}
    val myLambda1 : (Int) /*parameter type*/ -> Unit /*return type*/ = {num -> println("num: $num")}

    /*

    Lambda functions:

    Statement before -> is method parameters
    Statement after -> is method body

    var/val variable_name : type_of_variable/method_signature = variable_value

    type_of_variable --
    (data_type_of_param1, data_type_of_param2, data_type_of_param3, ..)->(data_type_of_return_value)

    variable_value --
    {param1_name, param2_name, ... -> method_body}

     */

    /*
    High level function is a function which accepts lambda function as a parameter and which can return lambda function
    as a value
     */

    obj.add(34, 56, myLambda) // way 1 of using lambdas

    obj.add(4, 5, {sum->println("Sum: $sum")}) // way 2 of using lambdas

    obj.add(8, 9) {sum-> println("Sum of numbers is: $sum")} // way 3 of using lambdas

}

class MathOp {
    //high level function with lambda as a parameter
    fun add(num1: Int, num2: Int, action: (Int)->Unit) { // (parameter_data_type)->return_value_data_type
        var sum = num1 + num2
        action(sum)
    }


    fun add(num1: Int, num2: Int, action: OpExecutor) {
        var sum: Int = num1 + num2
        action.execute(sum)
    }
}

interface OpExecutor {
    fun execute(sum: Int)
}