fun main() {
    var number =1
    val lastNumber =20
    var evenNumberCounter = 0

    while (number <= lastNumber){
        number++

        if(!isEvenNumber(number)){
            continue
        }
        evenNumberCounter++;
        println(number)
    }
    print("Total Number Of Even Number Found = $evenNumberCounter")
}

fun isEvenNumber(number:Int):Boolean{
    if((number%2) ==0){
        return true
    }else{
        return false
    }
}