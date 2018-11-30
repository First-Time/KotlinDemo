package section3

fun abs(d: Double): Double = if (d < 0) -d else d
fun sqrt(d: Double): Double = Math.sqrt(d)

fun comp(fun1: (Double) -> Double, fun2: (Double) -> Double): (Double) -> Double {
    return { x -> sqrt(abs(x)) }
}

fun main(args: Array<String>) {
    println(abs(-3.2))
    //将::abs和::sqrt组合起来
    val f = comp(::abs, ::sqrt)
    println(f(-25.0))
}