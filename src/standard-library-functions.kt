fun main(args: Array<String>){
    val ledy = Person("lool", 24, "Programmer")
    val man = Person("jamal", 28, "DB administritor")

    val x = if (ledy.age >= man.age) ledy else man
    x.printPerson()

    run { //run used to override values
        if (ledy.age >= man.age) ledy else man
    }.printPerson()

    with(ledy) { //is used to change instance properties without the need to call dot operator over the reference every time. it takes an argument.
        age += 1
        "Age is now $age"
    }.println()

    ledy.run {
        age += 1
        "Age is now $age"
    }.println()

    ledy.let { newPerson -> //takes the object it is invoked upon as the parameter and returns the result of the lambda expression and also returned as an argument.
        newPerson.age += 1
        "Age is now ${newPerson.age}"
    }.println()

    man.apply { //is an extension function on a type. It runs on the object reference into the expression and returns the object reference on completion.

        age += 1
        job = "Network manger"
    }.printPerson()

    man.also { // expressions do some additional processing on the object it was invoked. Unlike let, it returns the original object instead of any new return data.

        it.age += 1
        it.job = "YouTuber"
    }.printPerson()
}

data class Person(var name: String,
                  var age: Int,
                  var job: String) {
    fun printPerson() = println(this.toString())
}

fun String.println() = println(this)
