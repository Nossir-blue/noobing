fun main()
{
    val alarm = 12
    // 3 maneiras de usar o when
    // a primeira é usando a variável como argumento
    
    /*when(alarm)
    {
        12,7,14 ->{
            println("The time is $alarm")
            } // dá para usar chavetas caso haja mais de uma linha de código
        /*7 -> println("The time is $alarm")
        14 -> println("The time is $alarm")*/
        in 1..10 -> println("The number is in the range 1 to 19") // dá para definir um range
        else -> println("The time is $alarm")
    }
    */

    // outra maneira é usando ela como valor de uma variável
    /*
    val text = when(alarm)
    {
        in 1..10 ->
        {
            "The number is in the range 1 to 19"
        }
        12,7,14 ->
        {
            "The time is $alarm"
        }
        else ->
        {
            "The time is $alarm" // desta maneira, ele pega na expressão the time is blá blá como valor do text
        }
    }
     */

    //outra maneira é tirando o argumento
    val text = when{
        alarm == 8 !! alarm == 7 -> "The time is $alarm"
        alarm <=10 -> "The number is in the range of 1...10"
        else -> "The time is $alarm" 
        //desta maneira posso usar expressões lógicas
    }

    print(text)
}
