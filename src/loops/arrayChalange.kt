package loops

fun main() {
    val numbers = arrayOf(3,1,42,233,1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Minimum Number Is : ${findMinValue(numbers)}")
    println("Maximum Number Is : ${findMaxValue(numbers)}")

    println("Maximum Number Is : ${findMaxMin(numbers , true)}")
}


fun findMaxValue(number: Array<Int>):Int {
    var max = number[0]
    for (num in number) {
        if(num > max){
            max = num
        }
    }
    return max
}

fun findMinValue(number: Array<Int>):Int {
    var min = number[0]
    for (num in number) {
        if(num < min){
            min = num
        }
    }
    return min
}

fun findMaxMin(number: Array<Int> , searchMax :Boolean):Int{
    if(searchMax){
        var max = number[0]
        for (num in number) {
            if(num > max){
                max = num
            }
        }
        return max
    }else{
        var min = number[0]
        for (num in number) {
            if(num < min){
                min = num
            }
        }
        return min
    }
}