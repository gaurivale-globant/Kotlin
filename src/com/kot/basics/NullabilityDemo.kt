package com.kot.basics

fun main(args: Array<String>) {
    var a: String = "aaa"
    //a = null // above is non-null type String, so null value cannot be assigned to variable a, compiler gives error
    val aLen = a.length
    println("Length of string a: $aLen")

    var b: String? = "bbb"
    b = null // This is allowed because datatype of variable b is nullable
    //val bLen = b.length // compiler gives error here as value of variable b is null or variable b can be null because of its datatype

    //Way 1 for length calculation
    val bLen = if (null != b) b.length else -1
    println("Length of string b: $bLen")

    //Way 2 is use of Safe call operator ?.
    //this returns length of b if not null otherwise null
    b = "bbbb"
    var len: Int? = b?.length
    println("Length of b: $len")
    b = null
    len = b?.length
    println("Length of b: $len")

    /*
    Safe calls are useful in chains
    e.g. bob?.department?.head?.name
    Such a chain returns null if any of the properties in it is null.
     */

    /*
    To perform certain operations only on non-null values, let keyword can be used
     */
    var listWithNulls = listOf<String?>("ABC", null, "pqr")
    for (item in listWithNulls) {
        item?.let { println("Item: $item") } //null values will be ignored
    }

    /*
    // If either `person` or `person.department` is null, the function is not called:
    person?.department?.head = managersPool.getManager()
     */

    //Elvis operator-- ?:
    val lenOfb = b?.length ?: 0
    println("Length of by elvis operator: $lenOfb")

    /*
    throw and return are expression in Kotlin and hence they can be assigned to a variable
     */

    //bang-bang or double bang operator -- !!
    // !! operator -- not null assertion operator -- this will throw an exception if null
    //val l = b!!.length


    //Safe cast
    /*
    if casted variable is not of the typecasted type then it throws class cast exception
    to avoid this use safe cast as below
    this returns null if casting fails
     */
    //var num: Int = 90
    var num: String = "aa"
    var n: Int? = num as? Int
    println("n: $n")

    //Collections of nullability type
    val nullableList: List<Int?> = listOf(3, 78, null, 9, 0, 23)
    println("Nullable list: $nullableList")
    val nonNullList: List<Int> = nullableList.filterNotNull()
    println("Non-null list: $nonNullList")

}