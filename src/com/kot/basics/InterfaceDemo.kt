package com.kot.basics

/*
Interface can contain both abstract methods and methods having body as well
But can have only abstract properties, initialization of properties is not allowed
 */

interface InterfaceA {
    //by default every declaration in interface is abstract and open

    abstract open var name: String
    //var id: Int = 100 -- not allowed to be initialized

    fun onClick() {
        /*
        If method with implementation is added in interface then it is public and open by default
         */
        println("Interface:click")
    }

    fun onTouch()
}

class ImplA : InterfaceA {
    override fun onTouch() {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        println("touch event")
    }

    override var name: String = "fdfsd"
        //get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.
        //set(value) {}
    /*
    When a class is extended, its primary constructor is called while extending (in syntax).
    e.g. class A {}
    class B : A() //() indicates call to primary constructor of base class A {}
    But when an interface is implemented, constructor is not called being without implementation
    and instance of interface cannot be created
     */

    override fun onClick() {
        super.onClick()

        println("ImplA:onClick")
    }
}

fun main(args: Array<String>) {
    var obj1: ImplA = ImplA()
    obj1.onTouch()
    obj1.onClick()

}

interface InterA {
    fun one()
    fun two() {
        println("InterA:two")
    }
}

interface InterB {
    fun one() {
        println("InterB:one")
    }
    fun two() {
        println("InterB:two")
    }
}

class ImplAB : InterA, InterB {
    override fun one() {
        super.one()
        println("ImplAB:one")
    }

    //note: as both the interfaces have same signature methods with body, so need to be overridden in extended class
    override fun two() {
        super<InterA>.two() //<InterA> is written because there are two implementations available
        super<InterB>.two()
        println("ImplAB:two")
    }
}