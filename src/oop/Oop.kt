fun main() {
    val user = User("Ahiran","Kumarasingha",26)
    val friend = User("Ssiru","Udantha",25)

    println("Name ${user.firstName}")
    println("Name ${friend.firstName}")

}


class User( firstName:String,var lasName :String,var age:Int){

     lateinit var firstName : String

    init {
        if (firstName.toLowerCase().startsWith("a")){
           this.firstName = firstName
        }else{
            this.firstName = "User"
            println("The User Name Doesn,t start with 'a' Or 'A'")
        }
    }
}


