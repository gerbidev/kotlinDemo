
/*
Math Calculator
 */
fun main(arg:Array<String>){

    println("---- Math Calculator ----")
    print("Enter n1: ")
    var n1:Float= readLine()!!.toFloat()
    print("Enter n2: ")
    var n2:Float= readLine()!!.toFloat()
    var sum:Float?
    sum=n1*n2
    println("Sum: "+sum)
}