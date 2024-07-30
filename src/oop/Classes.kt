class Car( name:String, model :String, color:String, doors:Int){

    var name = name.trim()
    var model = name.trim()
    var color = name.trim()
    var doors = name.trim()

    fun move(){
        println("The Car $name is moving")
    }

    fun stop(){
        println("The Car $name is stop")
    }
}