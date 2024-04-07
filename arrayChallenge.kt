fun main()
{
    /*
        1 - create a function that is taking an array of integers as arguments
        2 - Figure a way to determine which number is the biggest number in that array
        return the number to the function
        3 - Create another function that does the same thing but is going to figure out the minimum number and return the value
        4 - Find a way to combine those 2 functions in just one function that is going to return the max value stored in that array or the minimum
     */ 
    val number = arrayOf(110,88,3,14,5,6,7,8,1)
    val MinAndMax = getMinAndMaxValues(number)
    println("The maximum number is ${MinAndMax[1]}\nThe minimum number is ${MinAndMax[0]}")
}
fun getMinAndMaxValues(number: Array<Int>): Array<Int>{
    // to get maximum
    var max = 0
    for(i in number){
            if(i > max){
            max = i
        }
    }
    
    // to get minimum
    var min = number[0]
    for(i in number){
        if(i < min){
            min = i
        }
    }
    val MinAndMax = arrayOf(min,max)

    return MinAndMax
}
/*
fun getMax(number: Array<Int>): Int{
    
    var max = 0
    for(i in number){
        if(i > max){
            max = i
        }
    }
    return max
}
fun getMin(number: Array<Int>): Int{
    var min = number[0]
    for(i in number){
        if(i < min){
            min = i
        }
    }
    return min
}*/