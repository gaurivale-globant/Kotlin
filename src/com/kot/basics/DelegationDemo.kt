package com.kot.basics

import kotlin.reflect.KProperty


/*
Object delegation:
Reusability of some behavior us achieved via composition rather than inheritance
Delegation is a way to make composition as powerful for reuse as inheritance
 */
interface Base {
    var message: String
    open fun print(n: Int)
    fun printWithMessage(n: Int)
}

class BaseImpl: Base {

    override var message: String = "This is Base class message"

    override fun print(n: Int) {
        println(n)
        println(message)
    }

    override fun printWithMessage(n: Int) {
        println("Value of n is $n")
    }
}
/*
Delegation design pattern
 */
class Derived(b: Base): Base by b {

    override var message: String = "This is derived class message"

/*
compiler will automatically generate methods of Base class and will internally call methods of b object on it
Compiler will delegate tasks to be done in methods of interface Base to object b
 */

    override fun printWithMessage(n: Int) {
        println("Derived class by delegation, n: $n")
    }
}


fun main(args: Array<String>) {

    var obj: BaseImpl = BaseImpl()
    obj.print(34)
    obj.printWithMessage(76)
    println(obj.message)

    var derived: Derived = Derived(obj)
    derived.print(89)
    derived.printWithMessage(67)
    println(derived.message)

    val e: Example = Example()
    println(e.p)

    e.p = "New Example"
    println("Updated p: ${e.p}")

}

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}