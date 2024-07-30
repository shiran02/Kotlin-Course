fun main() {

    // car1 ----------------------
    val car1 =  Car()
    car1.name = "Bmw"
    car1.model = "520D"
    car1.color = "White"
    car1.doors = 4

    println("Name ${car1.name}")
    println("Model ${car1.model}")
    println("Color ${car1.color}")
    println("Doors ${car1.doors}")

    car1.move()
    car1.stop()

    println("\n")

    // car 2 -------------

    val car2 = Car()
    car2.name = "Lancer"
    car2.model = "R Type"
    car2.color = "Black"
    car2.doors = 4

    println("Name ${car2.name}")
    println("Model ${car2.model}")
    println("Color ${car2.color}")
    println("Doors ${car2.doors}")

    car2.move()
    car2.stop()


}

class Car{
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move(){
        println("The Car $name is moving")
    }

    fun stop(){
        println("The Car $name is stop")
    }
}