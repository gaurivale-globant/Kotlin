import com.kot.basics.Person

fun main(args : Array<String>) : Unit {
    println("Hello Kotlin")
    println("Hello World")

    var firstStr = "This is my first string in kotlin"
    println(firstStr)

    println(23/5)

    println(23.0/5)

    println(true)

    var num = 789   // Int
    println(num)

    var str : String    //Mutable String

    str = "this is a str"


    val s1 = "new string"   //Immutable String

    displaySomething(s1)


    var perObj = Person("Anonymous")
    perObj.display()
    perObj.display()

    perObj.name = "John"
    perObj.display()

    println("Name $perObj.name")
    println("Name ${perObj.name}")
}

fun displaySomething(something : String) {
    print(something)
}
