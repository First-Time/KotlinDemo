private class ApplePack(weight: Double) {
    var weight = weight
    override fun toString(): String {
        return "ApplePack[weight=${this.weight}]"
    }
}

private class Apple(weight: Double) {
    var weight = weight
    override fun toString(): String {
        return "Apple[weight=${this.weight}]"
    }

    //定义中缀方法，使用infix修饰
    infix fun add(other: Apple): ApplePack {
        return ApplePack(this.weight + other.weight)
    }

    //定义中缀方法，使用infix修饰
    infix fun drop(other: Apple): Apple {
        this.weight - other.weight
        return this
    }
}

fun main(args: Array<String>) {
    var origin = Apple(3.4)
    //使用add方法
    val ap = origin add Apple(2.4)
    println(ap)
    origin drop Apple(1.4)
    println(origin)
}