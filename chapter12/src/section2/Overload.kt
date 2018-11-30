package section2

@JvmOverloads
fun test(name: String, len: Int = 20, price: Double = 2.2) {
    println(name)
    println(len)
    println(price)
}