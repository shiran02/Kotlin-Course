fun main(args: Array<String>) {

    // variables ------------------------

    /*

    var userName: String = "Shiran"
    // using var we can reassign variable valu , But val we cant change ------------

    userName = "isira"
    var age: Int = 26

     */

    // we can assign Like This ------------------------

    /*
    var userName = "Shiran"
    userName = "Shiran kumarasingha"

    var age = 12

    println("Hello,$userName! and My Age is $age")





    // Byte short int Long --------------------------------


    var number   = 26

    // Max Int value Find ------------------------------------------

    val maxIntergerValue   = Int.MAX_VALUE
    val minIntergerValue   = Int.MIN_VALUE

    println("Max Interger Value  $maxIntergerValue")
    println("Min Interger Value $minIntergerValue")

    number = 2147483647

    println("Number Interger Value $number")

    // max Byte Value Find -----------------------------------------


    val myMaxByteValue : Byte = Byte.MAX_VALUE
    val myMinByteValue : Byte = Byte.MIN_VALUE

    println("Min Byte Value $myMaxByteValue")
    println("Max Byte Value $myMinByteValue")


    // max Shot value find ------------------------------------------


    val myMaxShortValue : Short = Short.MAX_VALUE
    val myMinShortValue : Short = Short.MIN_VALUE

    println("Min Short Value $myMaxShortValue")
    println("Max Short Value $myMinShortValue")

    // max Logn value

    val myMaxLongValue : Long = Long.MAX_VALUE
    val myMinLongValue : Long = Long.MIN_VALUE

    println("Min Long Value $myMaxLongValue")
    println("Max Long Value $myMinLongValue")



    // float and double ----------------------------------------------

    val myNumber = 2.4f
    val mySecondNumber = 2.5

    println("My Number $myNumber")
    println("My Second Number $mySecondNumber")





    // char and boolean -----------------------------------------------

    val myCharValue = 'S'
    val myBoolean = true

    println("My Char value is $myCharValue and My Bool value is $myBoolean")



    // operators --------------------------------------------------------

    var x = 5
    var y = 3.0

//    val result = x + y
//    println("result is $result")


    println("x + y = ${x+y}")
    println("x - y = ${x-y}")
    println("x * y = ${x*y}")
    println("x / y = ${x/y}")
    println("x % y = ${x%y}")

    var result = x + y


    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    x = 0
    println("x = ${x++}")
    println("x = ${++x}")

    println("x = ${x--}")
    println("x = ${--x}")


    // CONDITION ------------------------------------------

   // val isActive = false
    val myNumber = 100

    if(myNumber>100){
        println("Greater than 130")
    }else if(myNumber <=100){
        println("Greater Than 90")
    }else{
        println("All the condition Are fail")
    }

    // <=  !=  >= ==   --------------------------------------------
    val isActive = false
    if(!isActive){
        println("Greater Than 90")
    }else{
        println("All the condition Are fail")
    }

    // -----

    var isPlaying = true
    val score = 100

    if(isPlaying && score == 100){
        println("Next level Open")
    }else{
        println("Still same Level")
    }

    val num1 = 20
    val num2 = 34

    if(num1>num2 || num2  < 100){
        println("Condition is true")
    }else{
        println("Condition is false")
    }




    val num1 = 20
    val num2 = 34

    val text = if (num1 > num2 && num2 < 100) {
        println("Condition is true")
        "This is Text 1"
    } else {
        println("Condition is false")
        "This is Text 2"
    }



    val age = 26
    val gap = 2

    val  name = if(age > gap || gap < 5) "Name is Shiran"  else  "Name is Shiran kumarasingha"

    println(name)




    val alarm = 12

    when(alarm){
        12 -> print("Time is $alarm")
        1 -> print("Time is $alarm")
        2 -> print("Time is $alarm")
        else -> print("Time is $alarm")
    }

    when(alarm){
        12,1,2,3,4 -> print("Time is $alarm")
        else -> print("Time is $alarm")
    }



    val age = 26

    when(age){
        in 1..10 -> print("Age IS In 1 To 10 Range")
        in 11..25 -> print("Age is In 11 To 25 Range")
        else -> print("Age Is Not In Range")
    }

    val alarm = 7

    val text = when{
        alarm == 8 || alarm == 7 -> "The Time is $alarm"
        alarm <= 10 -> "The Number is in the range 1 .. 10"
        else -> "the Time is $alarm"
    }





    // null value handle ------------

    val text : String? = null


    var name :String? ="Shiran"
    name = null
    if(name != null){
        print(name.length)
    }else   {
        println("The Variable is Null")
    }
    // Nullable Types ------------------------
    // -------------------------------------------

    var text1 :String? = null
    text1 = "This Varible is Not Null"
    var text2 :String = text1 ?: "Some text"
    println(text2)

    //-----------------------------------------
    if(text1 == null){
        text2 = "Some text"
    }else{
        text2 = "This variable is Not Null"
    }



    sayHello(name = "Shiran", age = 26)

    val hasInternetConnection = true

    if (hasInternetConnection) {
        getData(data = "Some Data")
    } else {
        showMessage()
    }


    val max = getMax(a = 12, b = 22)
    println("Max Number Is $max")

    val min = getMin(a = 32, b = 3)
    println("Min Value is : $min")

    val max3 = getMax3(2,3,4)
    println("Max Number Is $max3")


     */

    /// sendMessage()
    //sendMessage2(name = "Shiran")
    println(sum2(23, 1, 2, 3, 4, 3, 2, 3, 2, 3, 3, 3, 3, 32, 2, 23, 23, 4, 3))

}

fun sayHello(name: String, age: Int) {
    println("Hello $name Your age is $age")
}

fun getData(data: String) {
    println("Yout Data Is $data")
}

fun showMessage() {
    println("There is No Internet Connection")
}

fun getMax(a: Int, b: Int): Int {
    val max = if (a > b) a else b
    return max
}

fun getMax2(a: Int, b: Int): Int {

    return if (a > b) a else b
}

fun getMin(a: Int, b: Int): Int {
    if (a > b) {
        return b
    } else {
        return a
    }
}

fun getMax3(a: Int, b: Int) = if (a > b) a else b


fun getMax3(a: Int, b: Int, c: Int): Int {
    if (a >= b && a >= c) {
        return a
    } else if (b >= a && b >= c) {
        return b
    } else {
        return c
    }
}

fun sendMessage(name: String = "User", message: String = " ") {
    println("Name Is $name and Message is $message")
}

fun sendMessage2(name: String = "User", message: String = sendText()) {
    println("Name Is $name and Message is $message")
}

fun sendText(): String {
    return "Some Text"
}

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (number in numbers) {
        result += number

    }
    return result
}

fun sum2(vararg numbers: Int) {
    numbers.forEach {
        println(it)
    }
}

fun sum3(vararg numbers:Int){
    numbers.forEach {
        println(it)
    }
}