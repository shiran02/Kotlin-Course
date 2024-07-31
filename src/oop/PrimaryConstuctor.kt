package oop

fun main() {
    val person1 = Person("shiran")
    val person2 = Person("udith", "Kumarasingha")

    println("Person 1 Name ${person1.name} last Name ${person1.lastName} Age ${person1.age}")
    println("Person 2 Name ${person2.name} last Name ${person2.lastName} Age ${person2.age}")
}


class Person(var name: String, var lastName: String, var age: Int) {             // primary constructor -------------
    constructor(name: String) : this(name, lastName = "", age = 0){
        println("2 nd")
    }// secondary constructor ------------

    constructor(name: String, lastName: String) : this(name, lastName, age = 0){
        println("3 rd")
    }  // another secondary constructor -----


}