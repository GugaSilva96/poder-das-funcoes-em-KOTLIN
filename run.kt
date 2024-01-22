fun main() {
    fun getNullableLength(ns: String?): Int {
        println("for \"$ns\":")
        return ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlegth = $length")
            length
        } ?:0
    } 
println(getNullableLength(null))
println(getNullableLength(""))
println(getNullableLength("IABADABADU!!!"))
}
