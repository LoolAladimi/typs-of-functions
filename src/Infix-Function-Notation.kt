//User-defined Function With Infix Notation
class Structure() {

    infix fun createPyramid(rows: Int) {
        var j = 0
        for (i in 1..rows) {
            j = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (j != 2*i-1) {
                print("* ")
                ++j
            }
            println()
        }
    }
}

fun main(args: Array<String>) {
    val p = Structure()
    p createPyramid 4       // p.createPyramid(4)
}
