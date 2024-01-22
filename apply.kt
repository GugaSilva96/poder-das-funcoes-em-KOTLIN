data class Person (var name: String, var age: Int, var about: String) {
    constructor(): this("", 0, "")
}

fun main() {
    val guga = Person()
    val stringDescription = guga.apply {
        name = " Guga"
        age = 27
        about = " Back-End Developer"
    }.toString()
    
    println(stringDescription)
}
