data class Person (var name: String, var age: Int, var about: String){
    		constructor(): this("", 0, "")
}

fun writeCreationLog(p: Person) {
    println("A new RITM from ${p.name} (${p.about}) was sucefully created.")
    println("NAME: ${p.name}")
    println("AGE: ${p.age}")
    println("DESCRIPTION: ${p.about}")
}

fun main() {
    
    val guga = Person("Guga", 27, "Back-end Developer")
    	.also {
            writeCreationLog(it)
        }
}
