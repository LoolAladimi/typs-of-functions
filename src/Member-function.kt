//A local function is a function inside another function.
/*fun outerFunction(nice: String) {
    val hello = "Hello, world"

    fun innerFunction(awesome: String) {
        println(awesome)

        // we can access arguments of outer function
        println(nice)

        // and we can also access variables declared in outer functions
        println(hello)
    }

    // invoking inner function
    innerFunction("This is awesome")
}

fun main(args: Array<String>) {

    // we can access outerFunction but not innerFunction outside of the
    // outerFunction's scope
    outerFunction("This is nice")

}*/
//inlin function
/*fun main(){
    val numbers = listOf(1, 2, 3, 4, 5)
    for (number in numbers)
        println(number)

}*/
//The program below has a lambda expression that accepts two integers as parameters, and returns the product of those two integers.
/*fun main(){
    val product = { a: Int, b: Int -> a * b }
    val result = product(9, 3)
    println(result)
}*/
fun main(){
    val member = MemberFun()
    member.InLinefun("this is a InLine function", ::print)
    member.Lambda()
    member.LocalFun()
}

class MemberFun {
    private var lo = ""


    fun Lambda() {

        var loo = { println("this is a lambda function") }
        lo = loo().toString()
        println(lo)


    }

    inline fun InLinefun(str: String, lol: (String) -> Unit) {
        lol(str)
    }

    fun LocalFun() {
        lo = "this is a local function"
        fun printtype() {
            println(lo)

        }
        printtype()
    }
}

