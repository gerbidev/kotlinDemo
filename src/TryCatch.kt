import java.lang.Exception

fun main (args:Array<String>){


    try {
        println("Enter n2: ")
        var n2:Int= readLine()!!.toInt()

        var Div=100/n2

        println("DIV: $Div")
    }catch (ex:Exception){
        println(ex.message)
    }

    println("app is done")
}