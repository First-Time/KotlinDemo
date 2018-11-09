package section3

class CarSpeedMeter(var radius: Double) : SpeedMeter(0.0) {
    override fun calGirth(): Double {
        return radius * 2 * Math.PI
    }
}

fun main(args: Array<String>) {
    var csm = CarSpeedMeter(0.28)
    csm.turnRate = 15.0
    println(csm.getSpeed())
}