package loops

fun main() {

    /*
    // continue and break ------
    var number= 0

    while(number < 10){
        number ++
        if(number == 7){
            continue
        }
        println("Number is $number")

    }

     */

    // brake and continue ---
    /*
    for(i in 1..10){
        if(i in 3..5){
            continue
        }
        println(i)
    }
    */

    var number =0

    outer@ while (number < 5){
        number++
        println(number)

        var i = 0
        while (i<5){
            if(i==0) break@outer
            i++
            println("****$i")
        }
    }


}
