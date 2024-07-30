package loops

fun main() {
    val names = arrayOf("Shiran","Isira","Rashmika")
    val mixedElement = arrayOf(1,2,4,5,6,"Shiran","Isira",'A')
    names[0] = "kumarasingha"
    println("First element : ${names[0]}")
    println("Size Of Array : ${names.size}")

    for(name in names){
        println(name)
    }
    // is Key Word ----------------------------
    for(i in mixedElement){
        if(i is Char){
            println(i)
        }
    }
}