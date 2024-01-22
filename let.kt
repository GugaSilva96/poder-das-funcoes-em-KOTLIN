fun customPrint(s: String) {
    print(s.uppercase())
}

fun printNonNull(str: String?) {
    println("Printing \"$str\":")

    str?.let {
        print("\t")
        customPrint(it)
        println()
    }
}

fun printIfBothNull(strOne: String?, strTwo: String?) {
    strOne?.let { firstString ->
        strTwo?.let { secondString ->
            customPrint("$firstString : $secondString")
            println()
        }
    }
}

fun main() {
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    printNonNull(null)
    printNonNull("BAZINGA!")
    printIfBothNull("AMOR", "LOVE")
}
