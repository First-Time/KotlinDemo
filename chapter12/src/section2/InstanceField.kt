package section2

class InstanceField(name: String) {
    @JvmField
    val myName = name
}

fun main(args: Array<String>) {
    println(InstanceField("Kotlin").myName)
}