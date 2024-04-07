fun main()
{
    // create an arbitrary range of numbers and find a way
    // to go to that range and determine if the number is an
    // even or odd number
    // if odd, skip
    // if even, output it
    // count all the even numbers and display

    val numbers = 10
    var total = 0
    for(eachNumber in 0..numbers){
        if(eachNumber % 2 == 0){
            println("$eachNumber is pair")
        }
        else
            continue
        total += eachNumber
    }
    println("The total is $total")
}