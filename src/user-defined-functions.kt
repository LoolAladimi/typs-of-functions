fun main() {
    val userDefinedFun = UserDefinedFun()

    userDefinedFun.anonymousFun()
    userDefinedFun.userDefine()

}


class UserDefinedFun() {

    var classification="  "


    fun userDefine() {
        classification = "user define function with no return value"
        println(classification)
    }



    fun anonymousFun() {

        var x: () -> String = {

            classification= "anonymous function"
            classification
        }

        println("this is an  explicit type  anonymous function")
    }

}