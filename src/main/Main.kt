fun main() {

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

     */

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


}