data class Point(val x: Int, val y: Int) {
    //为Point类定义一个minus()方法
    operator fun minus(target: Point): Double {
        return Math.hypot((this.x - target.x).toDouble(), (this.y - target.y).toDouble())
    }
}

//以扩展方法的形式为Point类定义times()方法
operator fun Point.times(target: Point): Int {
    return Math.abs(this.x - target.x) * Math.abs(this.y - target.y)
}

fun main(args: Array<String>) {
    val p1 = Point(4, 10)
    val p2 = Point(5, 15)
    var distance = p1 - p2
    println("p1与p2的距离为：$distance")
    var area = p1 * p2
    println("p1与p2围成举行的面积为：$area")
}