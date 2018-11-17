package section2

class AuctionTest {
    var initPrice: Double = 30.0
    fun bid(bidPrice: String) {
        var d: Double
        try {
            d = bidPrice.toDouble()
        } catch (e: Exception) {
            //此方法完成本方法中可以对异常执行的修复处理
            //此处仅仅是在控制台打印异常的跟踪栈信息
            e.printStackTrace()
            //再次抛出自定义异常
//            throw AuctionException("竞拍价必须是数值，不能包含其他字符！")
            throw AuctionException(e)
        }
        if (initPrice > d) {
            throw AuctionException("竞拍价比起拍价低，不允许竞拍！")
        }
        initPrice = d
    }
}

fun main(args: Array<String>) {
    var at = AuctionTest()
    try {
        at.bid("df")
    } catch (e: Exception) {
        //再次捕获到bid()方法中的异常，并对该异常进行处理
        println(e.message)
    }
}