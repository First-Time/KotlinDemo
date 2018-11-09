package section3

//定义带转速属性的主构造器
abstract class SpeedMeter(var turnRate: Double) {
    //把返回车轮半径的方法定义成抽象方法
    abstract fun calGirth(): Double

    //定义计算速度的通用算法
    fun getSpeed(): Double {
        //速度等于车轮周长*转速
        return calGirth() * turnRate
    }
}