fun main(args:Array<String>){
    var a = 4
    var b = 8

  println("Enter operator type,either +,-,/,or *")
    val operator = readLine() //it reads the type of operator that you will input.
    val result= when (operator) {
        "+"->a+b
        "-"->a-b
        "/"->a/b
        "*"->a*b
        else-> "$operator is invalid operator"
    }

   println(result)


    }
fun us(args: Array<String>){
    var p = 3
    while (p<=12){
        println("line $p")
        ++p    // represents an increment.

    }

}




//GIven a list of 10 strings