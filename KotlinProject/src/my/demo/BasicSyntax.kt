package my.demo

fun main(args: Array<String>) {
    println("10+20= ${sum1(10,20)}");
}

/*Defining functions*/
fun sum1(a:Int,b:Int):Int{
    return a+b
}
fun sum2(a:Int,b:Int)=a+b

fun printSum(a:Int,b:Int):Unit{//returning no meaningful value(Unit can be omitted)
    println("sum of $a and $b is${a+b}")
}