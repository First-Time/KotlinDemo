package section2

class AuctionException : Exception {
    //无参数的构造器
    constructor()

    //带一个字符串参数的构造器
    constructor(msg: String) : super(msg)

    //创建一个可以接收Throwable参数的构造器
    constructor(t: Throwable) : super(t)
}